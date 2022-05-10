package com.example.data.dtos

import com.example.domain.model.LinksXXXXXXXXXModel

data class LinksXXXXXXXXX(
    val self: String?,
    val related: String?
)
fun LinksXXXXXXXXX.toDomain() = LinksXXXXXXXXXModel(self, related)