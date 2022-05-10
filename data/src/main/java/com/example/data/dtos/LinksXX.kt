package com.example.data.dtos

import com.example.domain.model.LinksXXModel

data class LinksXX(
    val self: String?,
    val related: String?
)
fun LinksXX.toDomain() = LinksXXModel(self, related)
