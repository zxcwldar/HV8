package com.example.domain.models.animemodel

data class DataModel(
    val id: String?,
    val type: String?,
    val links: LinksModel?,
    val attributes: AttributesModel?,
    val relationships: RelationshipsModel?
)
fun DataModel.toUI() = DataModel(id, type, links, attributes, relationships)