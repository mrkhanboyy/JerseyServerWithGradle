import org.glassfish.grizzly.http.server.HttpServer
import org.glassfish.jersey.grizzly2.httpserver.GrizzlyHttpServerFactory
import org.glassfish.jersey.server.ResourceConfig
import java.net.URI
import javax.ws.rs.core.UriBuilder


//@GET
//@Path("/status")
//@Produces(MediaType.TEXT_PLAIN)
//fun status(): Response {
//    return Response.status(Response.Status.OK).entity("Status of the User").build()
//}

class App {
    fun server(): HttpServer {
        val config = ResourceConfig().registerClasses(Resource::class.java)
        return GrizzlyHttpServerFactory.createHttpServer(baseUri(), config)

    }

   private fun baseUri(): URI {
        return UriBuilder.fromUri("http://localhost/").port(9090).build()
    }
}


fun main() {
    println("Starting HTTP Server...")
    var server = App().server()
    server.start()
    print("server started successfully")
}