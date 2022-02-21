package com.gitbed.routes

import io.ktor.routing.get
import io.ktor.routing.Route
import io.ktor.application.call
import io.ktor.response.respond
import io.ktor.http.HttpStatusCode

import com.gitbed.domain.usecases.GetRepositoriesUseCase

fun Route.getAllRepositoriesRoute(
    getRepositories: GetRepositoriesUseCase
) {
    get("/repositories") {
        try {
            val token = call.request.queryParameters["token"] ?: ""
            val page = call.request.queryParameters["page"]?.toInt() ?: 1
            val perPage = call.request.queryParameters["per_page"]?.toInt() ?: 20


            val repositories = getRepositories.getRepositories(page, perPage, token)
            call.respond(
                message = repositories,
                status = HttpStatusCode.OK
            )
        } catch (error: Exception) {
            call.respond(
                message = error.message.toString(),
                status = HttpStatusCode.NotFound
            )
        }
    }
}