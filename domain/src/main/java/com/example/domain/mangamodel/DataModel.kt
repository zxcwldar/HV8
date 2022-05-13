package com.example.domain.mangamodel

data class DataModel(
    val id: String,
    val type: String,
    val links: LinksModel,
    val attributes: AttributesModel,
    val relationships: RelationshipsModel
)