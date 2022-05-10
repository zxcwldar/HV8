package com.example.data.dtos

import com.example.domain.model.LinksXXXXXXXXXXXXModel

data class LinksXXXXXXXXXXXX(
    val self: String?,
    val related: String?
)
fun LinksXXXXXXXXXXXX.toDomain() = LinksXXXXXXXXXXXXModel(self, related)