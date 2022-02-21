package com.gitbed.infrastructure.plugins.client

import io.ktor.client.HttpClientConfig
import io.ktor.client.engine.cio.CIOEngineConfig

import io.ktor.http.ContentType
import io.ktor.client.features.json.JsonFeature
import io.ktor.client.features.json.serializer.KotlinxSerializer

fun HttpClientConfig<CIOEngineConfig>.configureJsonPlugin() {
    install(JsonFeature) {
        acceptContentTypes = listOf(
            ContentType.parse(ContentType.Application.Json.toString()))

        serializer = KotlinxSerializer(kotlinx.serialization.json.Json {
            isLenient = true
            prettyPrint = true
            ignoreUnknownKeys = true
        })
    }
}