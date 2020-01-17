package org.acme.quickstart;


import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.jboss.resteasy.annotations.jaxrs.PathParam;

@Path("/randomname")
public class RandomResource {

    @Inject
    RandomService service;

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String greeting(@PathParam String name) {
        return service.greeting(name);
    }
}