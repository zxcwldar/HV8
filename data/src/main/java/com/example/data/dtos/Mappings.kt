package com.example.data.dtos

import com.example.domain.model.LinksXXXXXModel
import com.example.domain.model.MappingsModel

data class Mappings(
    val links: LinksXXXXXModel?
)
fun Mappings.toDomain() = MappingsModel(links)