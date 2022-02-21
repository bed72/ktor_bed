package com.gitbed.data.usecases

import io.ktor.client.HttpClient

import com.gitbed.data.models.RepositoriesModel
import com.gitbed.domain.entities.RepositoriesEntity
import com.gitbed.domain.usecases.GetRepositoriesUseCase
import com.gitbed.data.models.RepositoriesModel.Companion.toEntity

import io.ktor.client.request.*
import io.ktor.http.*

class RemoteGetRepositoriesUseCase(
    private val client: HttpClient
) : GetRepositoriesUseCase {

    override suspend fun getRepositories(page: Int, perPage: Int, token: String): List<RepositoriesEntity> {
        val header = headersOf("authorization", "Bearer $token")

        val response = client.get<List<RepositoriesModel>>("") {
          
        }

        return response.map { it.toEntity() }
    }
}