package com.example.data.remote.animedtos

import com.example.domain.models.animemodel.LinksXXXXXXXXXXXXXModel
import com.example.domain.models.animemodel.StreamingLinksModel
import com.google.gson.annotations.SerializedName

data class StreamingLinks(
    @SerializedName("links")
    val links: LinksXXXXXXXXXXXXXModel?
)
fun StreamingLinks.toDomain() = StreamingLinksModel(links)