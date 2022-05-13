package com.example.kotlin2lesson6.presentation.models.manga

import com.example.domain.models.manga.MangaDataModel
import com.example.kotlin2lesson6.base.BaseDiffModel

data class MangaDataUI(
    override val id: String,
    val type: String,
    val links: LinksUI,
    val mangaDto: MangaUI,
    val relationships: RelationshipsUI
) : BaseDiffModel

fun MangaDataModel.toUI() =
    MangaDataUI(id, type, links.toUI(), mangaDto.toUI(), relationships.toUI())