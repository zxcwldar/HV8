package com.example.data.dtos

import com.example.domain.model.LinksXXXXXXXXXXModel
import com.example.domain.model.ProductionsModel

data class Productions(
    val links: LinksXXXXXXXXXXModel?
)
fun Productions.toDomain() = ProductionsModel(links)