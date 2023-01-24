package com.bjttools.routes

import com.bjttools.requests.ResistorsRequest
import com.bjttools.requests.resistorsRequests
import io.ktor.http.*
import io.ktor.server.application.*
import io.ktor.server.request.*
import io.ktor.server.response.*
import io.ktor.server.routing.*
import java.util.*


fun Route.resistorsRoute() {
    route("/resistors") {
        get {
            if (resistorsRequests.isNotEmpty())
                call.respond(resistorsRequests)
        }

        post {
            val request = call.receive<ResistorsRequest>()
            /* TODO validation
            val exceptionCheck = validate(request)
            if (exceptionCheck != null) { call.respond(HttpStatusCode.BadRequest, exceptionCheck.localizedMessage) }
            */
            if(resistorsRequests.size == 5) resistorsRequests.removeAt(0)
            resistorsRequests.add(request)
            val item = request.gm
            try {
                //TODO operations
            } catch(e: Exception) {
                call.respond(HttpStatusCode.InternalServerError, e.localizedMessage)
            }
            call.respond(ResistorsRequest(Calendar.getInstance().time.toString(), item))
        }
    }
}