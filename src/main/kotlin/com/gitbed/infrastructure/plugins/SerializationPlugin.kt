package com.gitbed.infrastructure.plugins

import io.ktor.application.install
import io.ktor.application.Application
import io.ktor.features.ContentNegotiation
import io.ktor.serialization.json
import kotlinx.serialization.json.Json

fun Application.configureSerializationPlugin() {
    install(ContentNegotiation) {
        json(Json {
            isLenient = true
            prettyPrint = true
        })
    }
}