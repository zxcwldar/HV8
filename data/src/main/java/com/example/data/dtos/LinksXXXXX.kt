package com.example.data.dtos

import com.example.domain.model.LinksXXXXXModel

data class LinksXXXXX(
    val self: String?,
    val related: String?
)
fun LinksXXXXX.toDomain() = LinksXXXXXModel(self, related)