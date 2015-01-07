package com.FAZAN.server;
 
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
 
@Path("/entry-point")
public class EntryPoint {
 
    @GET
    @Path("/test/{name}")
    @Produces(MediaType.TEXT_PLAIN)
    public String test(@PathParam("name")String name) {
        return name + "Test";
    }
    
    @GET
    @Path("/testul/{namep: [a-zA-Z]*}")
    @Produces(MediaType.APPLICATION_JSON)
    public String testul(@PathParam("namep")String name) {
        return name + "Testul";
    }
}	