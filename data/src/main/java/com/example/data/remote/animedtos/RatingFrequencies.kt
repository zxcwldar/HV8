package com.example.data.remote.animedtos

import com.example.domain.models.animemodel.RatingFrequenciesModel
import com.google.gson.annotations.SerializedName

data class RatingFrequencies(
    @SerializedName("x2")
    val x2: String?,
    @SerializedName("x3")
    val x3: String?,
    @SerializedName("x4")
    val x4: String?,
    @SerializedName("x5")
    val x5: String?,
    @SerializedName("x6")
    val x6: String?,
    @SerializedName("x7")
    val x7: String?,
    @SerializedName("x8")
    val x8: String?,
    @SerializedName("x9")
    val x9: String?,
    @SerializedName("x10")
    val x10: String?,
    @SerializedName("x11")
    val x11: String?,
    @SerializedName("x12")
    val x12: String?,
    @SerializedName("x13")
    val x13: String?,
    @SerializedName("x14")
    val x14: String?,
    @SerializedName("x15")
    val x15: String?,
    @SerializedName("x16")
    val x16: String?,
    @SerializedName("x17")
    val x17: String?,
    @SerializedName("x18")
    val x18: String?,
    @SerializedName("x19")
    val x19: String?,
    @SerializedName("x20")
    val x20: String?
)

fun RatingFrequencies.toDomain() = RatingFrequenciesModel(
    x2,
    x3,
    x4,
    x5,
    x6,
    x7,
    x8,
    x9,
    x10,
    x11,
    x12,
    x13,
    x14,
    x15,
    x16,
    x17,
    x18,
    x19,
    x20
)