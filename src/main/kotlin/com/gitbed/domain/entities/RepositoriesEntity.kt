package com.gitbed.domain.entities

data class RepositoriesEntity(
    val id: Number,
    val forks: Int,
    val stars: Int,
    val url: String,
    val name: String,
    val private: Boolean,
    val language: String,
    val description: String,
    val collaborators: List<CollaboratorsEntity>
)
