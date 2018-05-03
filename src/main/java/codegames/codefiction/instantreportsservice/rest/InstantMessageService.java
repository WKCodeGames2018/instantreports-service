package codegames.codefiction.instantreportsservice.rest;

import codegames.codefiction.instantreportsservice.rest.model.InstantMessage;
import instantreports.ApiException;
import instantreports.api.PayrollApi;
import instantreports.model.Sofortmeldung;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.HeaderParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/instantmessages")
public class InstantMessageService {

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getInstantMessage(@HeaderParam("Authorization") String token,
                                      @QueryParam("organization") String organization,
                                      @PathParam("id") String id) {


        try {
            PayrollApi api = new PayrollApi(Client.get());
            Sofortmeldung sofortmeldung = api.payrollSofortmeldungResourceIdGet(token, organization, id);
            return Response.ok().entity(map(sofortmeldung)).build();

        } catch (ApiException e) {
            e.printStackTrace();
            return Response.serverError().entity(e.getMessage()).build();
        }
    }

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response createInstantMessage(@HeaderParam("Authorization") String token,
                                         @QueryParam("organization") String organization,
                                         InstantMessage instantMessage) {
        try {
            PayrollApi api = new PayrollApi(Client.get());
            api.payrollSofortMeldungPost(token, organization, map(instantMessage));
            return Response.ok().build();
        } catch (ApiException e) {
            e.printStackTrace();
            return Response.serverError().entity(e.getMessage()).build();
        }
    }

    @Produces(MediaType.APPLICATION_JSON)
    public Response getAllInstantMessages(@HeaderParam("Authorization") String token,
                                          @QueryParam("organization") String organization) {
        try {
            PayrollApi api = new PayrollApi(Client.get());
            Sofortmeldung sofortmeldung = api.payrollSofortmeldungGet(token, organization, null, null, null, null);
            return Response.ok().entity(map(sofortmeldung)).build();

        } catch (ApiException e) {
            e.printStackTrace();
            return Response.serverError().entity(e.getMessage()).build();
        }
    }

    private static InstantMessage map(Sofortmeldung sofortmeldung) {
        return new InstantMessage()
            .setEntryDate(sofortmeldung.getEintrittsdatum())
            .setFileName(sofortmeldung.getFileName())
            .setName(sofortmeldung.getVorname())
            .setSurname(sofortmeldung.getNachname())
            .setSendOn(sofortmeldung.getSendedatum())
            .setSocialSecurityNo(sofortmeldung.getSvnummer())
            .setLocationNo(sofortmeldung.getBetriebstaettenummer());
    }

    private static Sofortmeldung map(InstantMessage instantMessage) {
        Sofortmeldung sofortmeldung = new Sofortmeldung();
        sofortmeldung.setBetriebstaettenummer(instantMessage.getLocationNo());
        sofortmeldung.setEintrittsdatum(instantMessage.getEntryDate());
        sofortmeldung.setNachname(instantMessage.getSurname());
        sofortmeldung.setVorname(instantMessage.getName());
        sofortmeldung.setSvnummer(instantMessage.getSocialSecurityNo());
        return sofortmeldung;
    }
}
