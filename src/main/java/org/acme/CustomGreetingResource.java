package org.acme;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import org.eclipse.microprofile.config.inject.ConfigProperty;

@Path("/customhello")
public class CustomGreetingResource {

    @ConfigProperty(name = "RUNNING_ENV", defaultValue = "UNKOWN RUNNING_ENV")
    String environment;

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
        return "Hello from Quarkus REST, testing this afternoon 1419, running from environment " + environment;
    }
}
