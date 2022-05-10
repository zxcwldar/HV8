package com.example.data.dtos

import com.example.domain.model.CategoriesModel
import com.example.domain.model.LinksXXModel

data class Categories(
    val links: LinksXXModel?
)
fun Categories.toDomain() = CategoriesModel(links)