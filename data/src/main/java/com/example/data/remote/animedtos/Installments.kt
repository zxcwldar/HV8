package com.example.data.remote.animedtos

import com.example.domain.models.animemodel.InstallmentsModel
import com.example.domain.models.animemodel.LinksXXXXModel
import com.google.gson.annotations.SerializedName

data class Installments(
    @SerializedName("links")
    val links: LinksXXXXModel?
)
fun Installments.toDomain() = InstallmentsModel(links)