package com.example.kotlin2lesson6.presentation.ui.fragments.main.anime.detailed

import com.example.domain.usecase.FetchAnimeUseCase
import com.example.kotlin2lesson6.base.BaseViewModel
import com.example.kotlin2lesson6.presentation.models.anime.SingleAnimeUI
import com.example.kotlin2lesson6.presentation.models.anime.toUI
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.asStateFlow
import javax.inject.Inject


@HiltViewModel
class AnimeDetailedViewModel @Inject constructor(
private val fetchAnimeUseCase: FetchAnimeUseCase
) : BaseViewModel() {
   private val _animeDetailedState =  mutableUiStateFlow<SingleAnimeUI>()
    var animeDetailedState =_animeDetailedState.asStateFlow()

    fun fetchADetailedAnime(id : String) =
  fetchAnimeUseCase(id).gatherRequest(_animeDetailedState){it.toUI()}
}