package com.gitbed.domain.usecases

import com.gitbed.domain.entities.RepositoriesEntity

interface GetRepositoriesUseCase {
    suspend fun getRepositories(page: Int = 1, perPage: Int = 10, token: String): List<RepositoriesEntity>
}