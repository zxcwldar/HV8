package com.example.kotlin2lesson6.presentation.ui.fragments.anime

import android.util.Log
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import by.kirich1409.viewbindingdelegate.viewBinding
import com.example.kotlin2lesson1.common.extentions.navigateSafelyUsingDirections
import com.example.kotlin2lesson6.R
import com.example.kotlin2lesson6.base.BaseFragment
import com.example.kotlin2lesson6.databinding.FragmentAnimeBinding
import com.example.kotlin2lesson6.presentation.exntensions.directionsSafeNavigation
import com.example.kotlin2lesson6.presentation.ui.adapters.AnimeAdapter
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class AnimeFragment  : BaseFragment<FragmentAnimeBinding, AnimeViewModel>(R.layout.fragment_anime) {
    override val binding by viewBinding(FragmentAnimeBinding::bind)
    override val viewModel: AnimeViewModel by viewModels()
    private val animeAdapter = AnimeAdapter(this::onClick)
    override fun assembleViews() {
        setupAdapter()
    }

    private fun setupAdapter() {
        binding.recyclerview.adapter = animeAdapter

    }

    override fun launchObservers() {
        viewModel.fetchAnime().spectatePaging(
            error = {
                Log.e("tag", it)
            },
            success = {
                animeAdapter.submitData(it)
            })
    }

    private fun onClick(id: String) {
        findNavController().directionsSafeNavigation(
            AnimeFragmentDirections.actionAnimeFragmentToAnimeDetailedFragment(
                id
            )
        )
    }


}