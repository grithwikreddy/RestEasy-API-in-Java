package com.Rest.Easy;


import com.Rest.Easy.Config.LaptopService;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.List;
import java.util.Optional;

@Path("/laptop")
@Produces(MediaType.APPLICATION_JSON)
public class LaptopResource {

    private static final LaptopService laptopService = new LaptopService();

    // Get all laptops
    @GET
    public Response getAllLaptops() {
        List<Laptop> laptops = laptopService.getAllLaptops();
        return Response.ok(laptops).build();
    }

    // Get laptop by ID
    @GET
    @Path("/{id}")
    public Response getLaptopById(@PathParam("id") int id) {
        Optional<Laptop> laptop = laptopService.getLaptopById(id);
        if (laptop.isPresent()) {
            return Response.ok(laptop.get()).build();
        }
        return Response.status(Response.Status.NOT_FOUND).entity("Laptop not found").build();
    }

    // Create new laptop
    @POST
    public Response createLaptop(Laptop laptop) {
        Laptop createdLaptop = laptopService.createLaptop(laptop);
        return Response.status(Response.Status.CREATED).entity(createdLaptop).build();
    }

    // Update laptop by ID
    @PUT
    @Path("/{id}")
    public Response updateLaptop(@PathParam("id") int id, Laptop laptop) {
        boolean isUpdated = laptopService.updateLaptop(id, laptop);
        if (isUpdated) {
            return Response.ok(laptop).build();
        }
        return Response.status(Response.Status.NOT_FOUND).entity("Laptop not found").build();
    }

    // Delete laptop by ID
    @DELETE
    @Path("/{id}")
    public Response deleteLaptop(@PathParam("id") int id) {
        boolean isDeleted = laptopService.deleteLaptop(id);
        if (isDeleted) {
            return Response.status(Response.Status.NO_CONTENT).build();
        }
        return Response.status(Response.Status.NOT_FOUND).entity("Laptop not found").build();
    }
}

