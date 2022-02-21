package com.gitbed.data.models

import kotlinx.serialization.Serializable
import com.gitbed.domain.entities.CollaboratorsEntity

@Serializable
data class CollaboratorsModel(
    val id: Int,
    val avatarUrl: String,
) {
    companion object {
        fun CollaboratorsModel.toEntity() =
            CollaboratorsEntity(
                id = this.id,
                avatarUrl = this.avatarUrl
            )
    }
}