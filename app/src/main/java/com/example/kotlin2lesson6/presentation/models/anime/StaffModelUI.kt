package com.example.kotlin2lesson6.presentation.models.anime

import com.example.domain.models.animemodel.StaffModel


data class StaffModelUI(
    val links: LinksXXXXXXXXXModelUI?
)
fun StaffModel.toUI() = StaffModelUI(links?.toUI())