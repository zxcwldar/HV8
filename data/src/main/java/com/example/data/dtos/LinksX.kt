package com.example.data.dtos

import com.example.domain.model.LinksXModel

data class LinksX(
    val self: String?,
    val related: String?
)
fun LinksX.toDomain() = LinksXModel(self, related)