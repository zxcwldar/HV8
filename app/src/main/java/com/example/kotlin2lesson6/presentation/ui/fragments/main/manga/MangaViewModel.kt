package com.example.kotlin2lesson6.presentation.ui.fragments.main.manga

import com.example.data.repositories.MangaRepositoryImpl
import com.example.kotlin2lesson6.base.BaseViewModel
import com.example.kotlin2lesson6.presentation.models.manga.toUI
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject
@HiltViewModel
class MangaViewModel @Inject constructor(
    private val mangaRepositoryImpl: MangaRepositoryImpl

) : BaseViewModel() {
    fun fetchManga() = mangaRepositoryImpl.fetchPageManga().gatherPagingRequest { it.toUI() }
}