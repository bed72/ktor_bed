package com.gitbed.infrastructure.di

import com.gitbed.infrastructure.plugins.client.configureJsonPlugin
import com.gitbed.infrastructure.plugins.client.configureHeaderPlugin
import com.gitbed.infrastructure.plugins.client.configureLoggingPlugin

import io.ktor.client.HttpClient
import io.ktor.client.engine.cio.CIO
import io.ktor.client.engine.cio.endpoint

import org.koin.dsl.module

val httpClientModule = module {
    single {
        HttpClient(CIO) {
//            engine {
//                maxConnectionsCount = 1000
//                endpoint {
//                    connectAttempts = 5
//                    pipelineMaxSize = 20
//                    keepAliveTime = 5000
//                    connectTimeout = 5000
//                    maxConnectionsPerRoute = 100
//                }
//            }

            configureJsonPlugin()
            configureHeaderPlugin()
            configureLoggingPlugin()
        }
    }
}

