package com.example.kotlin2lesson6.presentation.ui.fragments.anime

import com.example.domain.usecase.FetchAnimeUseCase
import com.example.kotlin2lesson6.base.BaseViewModel
import com.example.kotlin2lesson6.presentation.models.anime.AnimeModelUI
import com.example.kotlin2lesson6.presentation.models.anime.toUI
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.asStateFlow
import javax.inject.Inject

@HiltViewModel
class AnimeViewModel @Inject constructor(
    private val fetchAnimeUseCase: FetchAnimeUseCase
) : BaseViewModel() {


    private val _animeState = mutableUiStateFlow<AnimeModelUI>()
    var animeState = _animeState.asStateFlow()

    init {
        fetchAnime()
    }

    fun fetchAnime() = fetchAnimeUseCase().gatherRequest(_animeState) { it.toUI() }
}