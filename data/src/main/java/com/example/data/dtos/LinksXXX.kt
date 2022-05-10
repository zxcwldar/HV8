package com.example.data.dtos

import com.example.domain.model.LinksXXXModel

data class LinksXXX(
    val self: String?,
    val related: String?
)
fun LinksXXX.toDomain() = LinksXXXModel(self  , related)