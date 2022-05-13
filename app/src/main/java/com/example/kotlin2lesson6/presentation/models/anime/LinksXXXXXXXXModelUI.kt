package com.example.kotlin2lesson6.presentation.models.anime

import com.example.data.remote.animedtos.LinksXXXXXXXXModel

data class LinksXXXXXXXXModelUI(
    val self: String?,
    val related: String?
)
fun LinksXXXXXXXXModel.toUI() = LinksXXXXXXXXModelUI(self, related)