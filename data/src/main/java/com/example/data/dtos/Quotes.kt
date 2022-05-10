package com.example.data.dtos

import com.example.domain.model.LinksXXXXXXXXXXXModel
import com.example.domain.model.QuotesModel

data class Quotes(
    val links: LinksXXXXXXXXXXXModel?
)
fun Quotes.toDomain() = QuotesModel(links)