package com.example.data.dtos

import com.example.domain.model.LinksXXXXXXXXXModel
import com.example.domain.model.StaffModel

data class Staff(
    val links: LinksXXXXXXXXXModel?
)
fun Staff.toDomain() = StaffModel(links)