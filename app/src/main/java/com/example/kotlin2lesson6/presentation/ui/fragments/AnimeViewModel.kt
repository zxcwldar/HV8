package com.example.kotlin2lesson6.presentation.ui.fragments

import com.example.domain.usecase.FetchAnimeUseCase
import com.example.kotlin2lesson6.base.BaseViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class AnimeViewModel @Inject constructor(
    private val useCase: FetchAnimeUseCase
)   : BaseViewModel(){


    private val _animeState = mutableUiStateFlow<>()
}