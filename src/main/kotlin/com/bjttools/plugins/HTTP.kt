package com.bjttools.plugins

import io.ktor.http.*
import io.ktor.server.plugins.cors.routing.*
import io.ktor.server.application.*
import io.ktor.server.plugins.defaultheaders.*

fun Application.configureHTTP() {
    install(CORS) {
        allowMethod(HttpMethod.Post)
        allowMethod(HttpMethod.Options)
        allowMethod(HttpMethod.Get)
        allowMethod(HttpMethod.Delete)
        allowMethod(HttpMethod.Put)
        allowMethod(HttpMethod.Head)
        allowMethod(HttpMethod.Patch)
        allowHeader(HttpHeaders.AccessControlAllowHeaders)
        allowHeader(HttpHeaders.AccessControlAllowOrigin)
        allowHeader(HttpHeaders.AccessControlAllowMethods)
        allowHeader(HttpHeaders.ContentType)
        allowHeader(HttpHeaders.Authorization)
        allowHeader(HttpHeaders.Cookie)
        anyHost()
        allowNonSimpleContentTypes = true
        allowCredentials = true
        maxAgeInSeconds = 5
    }

    install(DefaultHeaders) {
        header("X-Engine", "Ktor")
    }
}
