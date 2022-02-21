package com.gitbed.infrastructure.plugins.client

import io.ktor.client.HttpClientConfig
import io.ktor.client.engine.cio.CIOEngineConfig

import io.ktor.http.HttpHeaders
import io.ktor.http.ContentType
import io.ktor.client.request.header
import io.ktor.client.features.DefaultRequest

fun HttpClientConfig<CIOEngineConfig>.configureHeaderPlugin() {
    install(DefaultRequest) {
        header(HttpHeaders.ContentType, ContentType.Application.Json)
    }
}