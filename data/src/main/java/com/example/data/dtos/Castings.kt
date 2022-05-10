package com.example.data.dtos

import com.example.domain.model.CastingsModel
import com.example.domain.model.LinksXXXModel

data class Castings(
    val links: LinksXXXModel?
)
fun Castings.toDomain() = CastingsModel(links)