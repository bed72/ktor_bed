package com.gitbed.infrastructure.plugins

import org.koin.ktor.ext.Koin
import org.koin.logger.slf4jLogger
import io.ktor.application.install
import io.ktor.application.Application

fun Application.configureKoinPlugin() {
    install(Koin) {
        slf4jLogger(level = org.koin.core.logger.Level.ERROR)
        modules()
    }
}