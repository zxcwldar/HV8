package com.example.data.dtos

import com.example.domain.model.LinksXXXXXXXXXXXXXXXXModel

data class LinksXXXXXXXXXXXXXXXX(
    val self: String?,
    val related: String?
)
fun LinksXXXXXXXXXXXXXXXX.toDomain() = LinksXXXXXXXXXXXXXXXXModel(self, related)