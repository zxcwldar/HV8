package com.example.data.remote.animedtos

import com.example.domain.models.animemodel.LinksXXXXXXXXXXModel
import com.example.domain.models.animemodel.ProductionsModel
import com.google.gson.annotations.SerializedName

data class Productions(
    @SerializedName("links")
    val links: LinksXXXXXXXXXXModel?
)
fun Productions.toDomain() = ProductionsModel(links)