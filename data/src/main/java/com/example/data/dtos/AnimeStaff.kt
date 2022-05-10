package com.example.data.dtos

import com.example.domain.model.AnimeStaffModel
import com.example.domain.model.LinksXXXXXXXXXXXXXXXXModel

data class AnimeStaff(
    val links: LinksXXXXXXXXXXXXXXXXModel?
)
fun AnimeStaff.toDomain() = AnimeStaffModel(links)