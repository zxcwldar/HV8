package com.example.kotlin2lesson6.presentation.models.anime

import com.example.domain.models.animemodel.QuotesModel


data class QuotesModelUI(
    val links: LinksXXXXXXXXXXXModelUI?
)
fun QuotesModel.toUI() = QuotesModelUI(links?.toUI())