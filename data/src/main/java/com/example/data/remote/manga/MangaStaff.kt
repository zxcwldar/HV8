package com.example.data.remote.manga


import com.google.gson.annotations.SerializedName
import com.example.domain.models.manga.MangaStaffModel

data class MangaStaff(
    @SerializedName("links")
    val links: LinksXXXXXXXXXX
)

fun MangaStaff.toDomain() =
    MangaStaffModel(links.toDomain())