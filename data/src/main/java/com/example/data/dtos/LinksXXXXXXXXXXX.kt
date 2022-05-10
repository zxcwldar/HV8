package com.example.data.dtos

import com.example.domain.model.LinksXXXXXXXXXXXModel

data class LinksXXXXXXXXXXX(
    val self: String?,
    val related: String?
)
fun LinksXXXXXXXXXXX.toDomain() = LinksXXXXXXXXXXXModel(self, related)


