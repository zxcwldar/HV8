package com.example.data.dtos

import com.example.domain.model.LinksXXXXModel

data class LinksXXXX(
    val self: String?,
    val related: String?
)
fun LinksXXXX.toDomain() = LinksXXXXModel(self, related)