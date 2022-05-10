package com.example.data.dtos

data class LinksXXXXXXXX(
    val self: String?,
    val related: String?
)
fun LinksXXXXXXXX.toDomain() = LinksXXXXXXXXModel(self, related)