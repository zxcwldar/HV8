package com.example.data.remote.animedtos

import com.example.domain.models.animemodel.LinksXXXXXXXXXModel
import com.example.domain.models.animemodel.StaffModel
import com.google.gson.annotations.SerializedName

data class Staff(
    @SerializedName("links")
    val links: LinksXXXXXXXXXModel?
)
fun Staff.toDomain() = StaffModel(links)