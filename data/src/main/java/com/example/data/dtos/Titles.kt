package com.example.data.dtos

import com.example.domain.model.TitlesModel

data class Titles(
    val en: String?,
    val en_jp: String?,
    val ja_jp: String?
)
fun Titles.toDomain() = TitlesModel(en, en_jp, ja_jp)