package com.example.data.dtos

import com.example.domain.model.LinksModel

data class Links(
    val self: String?
)
fun Links.toDomain() = LinksModel(self)