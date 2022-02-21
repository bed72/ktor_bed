package com.gitbed.data.models

import kotlinx.serialization.Serializable

import com.gitbed.domain.entities.RepositoriesEntity
import com.gitbed.data.models.CollaboratorsModel.Companion.toEntity

@Serializable
data class RepositoriesModel(
    val id: Int,
    val forks: Int,
    val stars: Int,
    val url: String,
    val name: String,
    val private: Boolean,
    val language: String,
    val description: String,
    val collaborators: List<CollaboratorsModel>
) {
    companion object {
        fun RepositoriesModel.toEntity() =
            RepositoriesEntity(
                id = this.id,
                url = this.url,
                name = this.name,
                forks = this.forks,
                stars = this.stars,
                private = this.private,
                language = this.language,
                description = this.description,
                collaborators = this.collaborators.map { collaborators ->
                    collaborators.toEntity()
                }
            )
    }
}
