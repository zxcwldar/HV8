package com.example.kotlin2lesson6.presentation.ui.fragments.manga.detailed

import com.example.domain.usecase.FetchMangaUseCase
import com.example.kotlin2lesson6.base.BaseViewModel
import com.example.kotlin2lesson6.presentation.models.manga.SingleMangaUI
import com.example.kotlin2lesson6.presentation.models.manga.toUI
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.asStateFlow
import javax.inject.Inject


@HiltViewModel
class MangaDetailedViewModel @Inject constructor(
    private val fetchMangaUseCase: FetchMangaUseCase
) : BaseViewModel() {
    private val _mangaDetailedState = mutableUiStateFlow<SingleMangaUI>()
    var mangaDetailedState = _mangaDetailedState.asStateFlow()

    fun fetchDetailedManga(id: String) =
        fetchMangaUseCase(id).gatherRequest(_mangaDetailedState) { it.toUI() }
}
