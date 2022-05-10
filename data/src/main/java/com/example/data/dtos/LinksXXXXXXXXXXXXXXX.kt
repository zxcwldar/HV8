package com.example.data.dtos

import com.example.domain.model.LinksXXXXXXXXXXXXXXXModel

data class LinksXXXXXXXXXXXXXXX(
    val self: String?,
    val related: String?
)
fun LinksXXXXXXXXXXXXXXX.toDomain() = LinksXXXXXXXXXXXXXXXModel(self, related)