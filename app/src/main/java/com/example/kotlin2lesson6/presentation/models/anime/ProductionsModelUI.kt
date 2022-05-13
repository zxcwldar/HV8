package com.example.kotlin2lesson6.presentation.models.anime

import com.example.domain.models.animemodel.ProductionsModel


data class ProductionsModelUI(
    val links: LinksXXXXXXXXXXModelUI?
)
fun ProductionsModel.toUI() = ProductionsModelUI(links?.toUI())