package com.example.helth;

import javax.json.bind.JsonbBuilder;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;
import java.time.LocalDateTime;

@Path("/time")
public class TimeController {
    @GET
    public Response getTime(){
        LocalDateTime localDateTime = LocalDateTime.now();
        String jsonbBuilder = JsonbBuilder.create().toJson(localDateTime);
        return Response.ok(jsonbBuilder).build();
    }
}
