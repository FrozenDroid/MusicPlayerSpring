package com.frozendroid.MusicPlayer

import org.springframework.stereotype.Component
import javax.ws.rs.GET
import javax.ws.rs.Path
import javax.ws.rs.Produces
import javax.ws.rs.core.MediaType

@Component
@Path("/")
class TestController {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    fun index(): TestMessage {
        return TestMessage(message = "Aaa")
    }

}
