package com.example.data.dtos

import com.example.domain.model.EpisodesModel
import com.example.domain.model.LinksXXXXXXXXXXXXModel

data class Episodes(
    val links: LinksXXXXXXXXXXXXModel?
)
fun Episodes.toDomain() = EpisodesModel(links)