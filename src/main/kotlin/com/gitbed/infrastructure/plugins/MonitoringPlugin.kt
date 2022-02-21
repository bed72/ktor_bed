package com.gitbed.infrastructure.plugins

import io.ktor.application.install
import io.ktor.features.CallLogging
import io.ktor.application.Application

fun Application.configureMonitoringPlugin() {
    install(CallLogging)
}
