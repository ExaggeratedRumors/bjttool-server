package com.bjttools.routes

import com.bjttools.requests.VoltageRequest
import com.bjttools.requests.voltageRequests
import io.ktor.server.application.*
import io.ktor.server.request.*
import io.ktor.server.response.*
import io.ktor.server.routing.*

fun Route.voltageRoute() {
    route("/voltage") {
        get {
            if (voltageRequests.isNotEmpty())
                call.respond(voltageRequests)
        }

        post {
            val request = call.receive<VoltageRequest>()
            if(voltageRequests.size == 5) voltageRequests.removeAt(0)
            voltageRequests.add(request)
            call.respond(
                0 //TODO operations
            )
        }
    }
}