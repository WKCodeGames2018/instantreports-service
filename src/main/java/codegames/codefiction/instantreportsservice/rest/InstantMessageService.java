package codegames.codefiction.instantreportsservice.rest;

import codegames.codefiction.instantreportsservice.rest.model.InstantMessage;

import javax.ws.rs.*;
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

        return Response.ok().build();

    }

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response createInstantMessage(@HeaderParam("Authorization") String token,
                                         @QueryParam("organization") String organization,
                                         InstantMessage instantMessage) {
        return Response.ok().build();
    }

    @Produces(MediaType.APPLICATION_JSON)
    public Response getAllInstantMessages(@HeaderParam("Authorization") String token,
                                          @QueryParam("organization") String organization) {
        return Response.ok().build();
    }
}
