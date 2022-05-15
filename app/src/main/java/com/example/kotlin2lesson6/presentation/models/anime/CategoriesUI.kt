package com.example.kotlin2lesson6.presentation.models.anime

import com.example.domain.models.anime.CategoriesModel


data class CategoriesUI(
    val links: LinksXXUI
)

fun CategoriesModel.toUI() = CategoriesUI(links.toUI())