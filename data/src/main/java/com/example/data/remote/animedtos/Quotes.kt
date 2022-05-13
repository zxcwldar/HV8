package com.example.data.remote.animedtos

import com.example.domain.models.animemodel.LinksXXXXXXXXXXXModel
import com.example.domain.models.animemodel.QuotesModel
import com.google.gson.annotations.SerializedName

data class Quotes(
    @SerializedName("links")
    val links: LinksXXXXXXXXXXXModel?
)
fun Quotes.toDomain() = QuotesModel(links)