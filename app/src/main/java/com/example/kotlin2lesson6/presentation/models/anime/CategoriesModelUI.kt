package com.example.kotlin2lesson6.presentation.models.anime

import com.example.domain.models.animemodel.CategoriesModel

data class CategoriesModelUI(
    val links: LinksXXModelUI?
)
fun CategoriesModel.toUI() = CategoriesModelUI(links?.toUI())