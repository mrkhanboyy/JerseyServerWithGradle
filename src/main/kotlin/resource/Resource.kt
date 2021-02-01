import javax.ws.rs.GET
import javax.ws.rs.Path
import javax.ws.rs.Produces
import javax.ws.rs.core.MediaType
import javax.ws.rs.core.Response

@Path("/api/v1")
class Resource{


    @GET
    @Path("/status")
    @Produces(MediaType.TEXT_PLAIN)
    fun status(): Response {
        return Response.status(Response.Status.OK).entity("Status of the server").build()
    }

}