package com.example.data.remote.animedtos

import com.example.domain.models.animemodel.AttributesModel
import com.example.domain.models.animemodel.DataModel
import com.example.domain.models.animemodel.LinksModel
import com.example.domain.models.animemodel.RelationshipsModel
import com.google.gson.annotations.SerializedName

data class Data(
    @SerializedName("id")
    val id: String?,
    @SerializedName("type")
    val type: String?,
    @SerializedName("links")
    val links: LinksModel?,
    @SerializedName("attributes")
    val attributes: AttributesModel?,
    @SerializedName("relationships")
    val relationships: RelationshipsModel?
)
fun Data.toDomain() = DataModel(id, type, links, attributes, relationships)