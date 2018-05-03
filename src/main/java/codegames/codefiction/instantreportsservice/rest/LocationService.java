package codegames.codefiction.instantreportsservice.rest;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/locations")
public class LocationService {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response getLocations(@HeaderParam("Authorization") String token,
                                 @QueryParam("organization") String organization) {
        return Response.ok().build();
    }
}
