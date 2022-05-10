package com.example.data.dtos

import com.example.domain.model.InstallmentsModel
import com.example.domain.model.LinksXXXXModel

data class Installments(
    val links: LinksXXXXModel?
)
fun Installments.toDomain() = InstallmentsModel(links)