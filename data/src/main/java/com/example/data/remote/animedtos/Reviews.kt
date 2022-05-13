package com.example.data.remote.animedtos

import com.example.domain.models.animemodel.LinksXXXXXXModel
import com.example.domain.models.animemodel.ReviewsModel
import com.google.gson.annotations.SerializedName

data class Reviews(
    @SerializedName("links")
    val links: LinksXXXXXXModel?
)
fun Reviews.toDomain() = ReviewsModel(links)