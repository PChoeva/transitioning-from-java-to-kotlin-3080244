package com.linkedinlearning

import io.ktor.server.engine.*
import io.ktor.server.netty.*
import com.linkedinlearning.plugins.*
import io.ktor.server.application.*
import io.ktor.server.plugins.callloging.*
import io.ktor.server.request.*

fun main() {
    embeddedServer(Netty, port = 8080, host = "0.0.0.0") {
        configureRouting()
        configureCallLogging()
    }.start(wait = true)
}
