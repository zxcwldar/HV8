package com.example.data.dtos

import com.example.domain.model.LinksXXXXXXModel
import com.example.domain.model.ReviewsModel

data class Reviews(
    val links: LinksXXXXXXModel?
)
fun Reviews.toDomain() = ReviewsModel(links)