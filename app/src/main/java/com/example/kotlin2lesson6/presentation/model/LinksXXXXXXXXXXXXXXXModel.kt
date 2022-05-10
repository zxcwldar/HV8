package com.example.kotlin2lesson6.presentation.model

import com.example.domain.model.LinksXXXXXXXXXXXXXXXModel

data class LinksXXXXXXXXXXXXXXXModel(
    val self: String?,
    val related: String?
)
fun LinksXXXXXXXXXXXXXXXModel.toUI() = com.example.kotlin2lesson6.presentation.model.LinksXXXXXXXXXXXXXXXModel(self,related)