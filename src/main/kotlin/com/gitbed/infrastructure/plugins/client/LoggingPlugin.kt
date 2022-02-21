package com.gitbed.infrastructure.plugins.client

import io.ktor.client.HttpClientConfig
import io.ktor.client.engine.cio.CIOEngineConfig

import io.ktor.client.features.logging.Logger
import io.ktor.client.features.logging.Logging
import io.ktor.client.features.logging.DEFAULT
import io.ktor.client.features.logging.LogLevel

fun HttpClientConfig<CIOEngineConfig>.configureLoggingPlugin() {
    install(Logging) {
        logger = Logger.DEFAULT
        level = LogLevel.HEADERS
    }
}