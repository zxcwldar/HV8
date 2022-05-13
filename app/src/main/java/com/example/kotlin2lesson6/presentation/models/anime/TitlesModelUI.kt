package com.example.kotlin2lesson6.presentation.models.anime

import com.example.domain.models.animemodel.TitlesModel

data class TitlesModelUI(
    val en: String?,
    val en_jp: String?,
    val ja_jp: String?
)
fun TitlesModel.toUI() = TitlesModelUI(en, en_jp, ja_jp)