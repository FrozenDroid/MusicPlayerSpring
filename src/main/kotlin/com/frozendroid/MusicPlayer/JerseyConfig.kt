package com.frozendroid.MusicPlayer

import org.glassfish.jersey.server.ResourceConfig
import org.springframework.stereotype.Component

@Component
class JerseyConfig : ResourceConfig() {

    init {
        registerEndpoints()
    }

    private fun registerEndpoints() {
        register(TestController())
    }

}