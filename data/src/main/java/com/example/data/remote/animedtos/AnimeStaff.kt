package com.example.data.remote.animedtos

import com.example.domain.models.animemodel.AnimeStaffModel
import com.example.domain.models.animemodel.LinksXXXXXXXXXXXXXXXXModel
import com.google.gson.annotations.SerializedName

data class AnimeStaff(
    @SerializedName("links")
    val links: LinksXXXXXXXXXXXXXXXXModel?
)
fun AnimeStaff.toDomain() = AnimeStaffModel(links)