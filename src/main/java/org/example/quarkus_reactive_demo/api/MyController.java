package org.example.quarkus_reactive_demo.api;

import io.smallrye.mutiny.Multi;
import org.example.quarkus_reactive_demo.service.MyService;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("/api")
public class MyController {

    @Inject
    MyService myService;

    @GET
    public Multi<MyDTO> list() {
        return myService.getAll().onItem().transform(MyMapper::toDTO);
    }

}