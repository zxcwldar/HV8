package com.example.data.dtos

import com.example.domain.model.LinksXXXXXXXXXXXXXXModel

data class LinksXXXXXXXXXXXXXX(
    val self: String?,
    val related: String?
)
fun LinksXXXXXXXXXXXXXX.toDomain() = LinksXXXXXXXXXXXXXXModel(self, related)