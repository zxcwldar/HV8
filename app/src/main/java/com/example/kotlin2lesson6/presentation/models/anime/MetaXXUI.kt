package com.example.kotlin2lesson6.presentation.models.anime

import com.example.domain.models.anime.MetaXXModel


data class MetaXXUI(
    val count: Int
)

fun MetaXXModel.toUI() = MetaXXUI(count)
