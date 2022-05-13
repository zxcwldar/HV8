package com.example.data.remote.animedtos

import com.example.domain.models.animemodel.TitlesModel
import com.google.gson.annotations.SerializedName

data class Titles(
    @SerializedName("en")
    val en: String?,
    @SerializedName("en_jp")
    val en_jp: String?,
    @SerializedName("ja_jp")
    val ja_jp: String?
)
fun Titles.toDomain() = TitlesModel(en, en_jp, ja_jp)