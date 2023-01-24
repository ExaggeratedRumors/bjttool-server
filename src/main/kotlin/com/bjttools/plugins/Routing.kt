package com.bjttools.plugins

import com.bjttools.routes.*
import io.ktor.server.routing.*
import io.ktor.server.application.*

fun Application.configureRouting() {
    routing {
        voltageRoute()
        resistorsRoute()
    }
}
