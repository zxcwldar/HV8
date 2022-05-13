package com.example.kotlin2lesson6.presentation.models.anime

import com.example.domain.models.animemodel.ReviewsModel


data class ReviewsModelUI(
    val links: LinksXXXXXXModelUI?
)
fun ReviewsModel.toUI() = ReviewsModelUI(links?.toUI())