package com.example.kotlin2lesson6.presentation.models.anime

import com.example.domain.models.animemodel.AnimeStaffModel

data class AnimeStaffModelUI(
    val links: LinksXXXXXXXXXXXXXXXXModelUI?
)
fun AnimeStaffModel.toUI() = AnimeStaffModelUI(links?.toUI())