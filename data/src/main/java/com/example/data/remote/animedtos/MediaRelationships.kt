package com.example.data.remote.animedtos

import com.example.domain.models.animemodel.LinksXXXXXXXModel
import com.example.domain.models.animemodel.MediaRelationshipsModel
import com.google.gson.annotations.SerializedName

data class MediaRelationships(
    @SerializedName("links")
    val links: LinksXXXXXXXModel?
)
fun MediaRelationships.toDomain() = MediaRelationshipsModel(links)