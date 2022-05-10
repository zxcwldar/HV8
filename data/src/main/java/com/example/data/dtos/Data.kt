package com.example.data.dtos

import com.example.domain.model.AttributesModel
import com.example.domain.model.DataModel
import com.example.domain.model.LinksModel
import com.example.domain.model.RelationshipsModel

data class Data(
    val id: String?,
    val type: String?,
    val links: LinksModel?,
    val attributes: AttributesModel?,
    val relationships: RelationshipsModel?
)
fun Data.toDomain() = DataModel(id, type, links, attributes, relationships)