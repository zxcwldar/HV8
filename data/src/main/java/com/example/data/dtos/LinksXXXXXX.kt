package com.example.data.dtos

import com.example.domain.model.LinksXXXXXXModel

data class LinksXXXXXX(
    val self: String?,
    val related: String?
)
fun LinksXXXXXX.toDomain() = LinksXXXXXXModel(self, related)