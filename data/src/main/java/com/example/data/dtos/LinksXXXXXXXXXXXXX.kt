package com.example.data.dtos

import com.example.domain.model.LinksXXXXXXXXXXXXXModel

data class LinksXXXXXXXXXXXXX(
    val self: String?,
    val related: String?
)
fun LinksXXXXXXXXXXXXX.toDomain() = LinksXXXXXXXXXXXXXModel(self, related)