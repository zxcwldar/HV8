package com.example.kotlin2lesson6.presentation.models.anime

import com.example.domain.models.animemodel.DataModel
import com.example.kotlin2lesson6.base.BaseDiffModel

data class DataModelUI(
    override val id: String?,
    val type: String?,
    val links: LinksModelUI?,
    val attributes: AttributesModelUI?,
    val relationships: RelationshipsModelUI?
) : BaseDiffModel
fun DataModel.toUI() = DataModelUI(id , type , links?.toUI() , attributes?.toUI() , relationships?.toUI())