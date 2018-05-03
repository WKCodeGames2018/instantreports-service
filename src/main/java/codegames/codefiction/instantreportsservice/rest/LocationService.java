package codegames.codefiction.instantreportsservice.rest;

import codegames.codefiction.instantreportsservice.rest.model.Location;
import instantreports.ApiClient;
import instantreports.ApiException;
import instantreports.api.PayrollApi;
import instantreports.model.BetriebstaetteApi;
import instantreports.model.Firmendaten;

import javax.ws.rs.GET;
import javax.ws.rs.HeaderParam;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/locations")
public class LocationService {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response getLocations(@HeaderParam("Authorization") String token,
                                 @QueryParam("organization") String organization) {

        try {
            ApiClient apiClient = Client.get();
            PayrollApi payrollApi = new PayrollApi(apiClient);
            Firmendaten firmendaten = payrollApi.payrollFirmendatenGet(token, organization, null, null, null, null);
            BetriebstaetteApi betriebsstaetten = firmendaten.getBetriebsstaetten();

            Location location = new Location();
            location.setId(betriebsstaetten.getBetriebsnummer());
            location.setName(betriebsstaetten.getName());


            return Response.ok().entity(location).build();
        } catch (ApiException e) {
            e.printStackTrace();
            return Response.serverError().entity(e.getMessage()).build();
        }

    }
}
