package com.example.kotlin2lesson6.presentation.ui.fragments.main.anime

import com.example.data.repositories.AnimeRepositoryImpl
import com.example.kotlin2lesson6.base.BaseViewModel
import com.example.kotlin2lesson6.presentation.models.anime.toUI
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class AnimeViewModel @Inject constructor(
    private val animeRepositoryImpl: AnimeRepositoryImpl
) : BaseViewModel() {

    fun fetchAnime() =
        animeRepositoryImpl.fetchPageAnime().gatherPagingRequest {
            it.toUI()
        }


}