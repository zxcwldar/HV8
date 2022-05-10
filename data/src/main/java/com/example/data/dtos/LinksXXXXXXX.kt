package com.example.data.dtos

import com.example.domain.model.LinksXXXXXXXModel

data class LinksXXXXXXX(
    val self: String?,
    val related: String?
)
fun LinksXXXXXXX.toDomain() = LinksXXXXXXXModel(self, related)