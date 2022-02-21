package com.gitbed

import io.ktor.server.cio.CIO
import io.ktor.server.engine.embeddedServer

import com.gitbed.infrastructure.plugins.configureKoinPlugin
import com.gitbed.infrastructure.plugins.configureRoutingPlugin
import com.gitbed.infrastructure.plugins.configureMonitoringPlugin
import com.gitbed.infrastructure.plugins.configureSerializationPlugin

fun main() {
    embeddedServer(CIO, port = 8080, host = "0.0.0.0") {
        configureKoinPlugin()
        configureRoutingPlugin()
        configureMonitoringPlugin()
        configureSerializationPlugin()
    }.start(wait = true)
}
