package com.example.data.dtos

import com.example.domain.model.LinksXXXXXXXXXXModel

data class LinksXXXXXXXXXX(
    val self: String?,
    val related: String?
)
fun LinksXXXXXXXXXX.toDomain() = LinksXXXXXXXXXXModel(self, related)