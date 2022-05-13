package com.example.data.remote.animedtos

import com.example.domain.models.animemodel.CategoriesModel
import com.example.domain.models.animemodel.LinksXXModel
import com.google.gson.annotations.SerializedName

data class Categories(
    @SerializedName("links")
    val links: LinksXXModel?
)
fun Categories.toDomain() = CategoriesModel(links)