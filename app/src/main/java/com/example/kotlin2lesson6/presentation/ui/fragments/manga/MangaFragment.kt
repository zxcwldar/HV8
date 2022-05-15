package com.example.kotlin2lesson6.presentation.ui.fragments.manga

import android.util.Log
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import by.kirich1409.viewbindingdelegate.viewBinding
import com.example.kotlin2lesson6.R
import com.example.kotlin2lesson6.base.BaseFragment
import com.example.kotlin2lesson6.databinding.FragmentMangaBinding
import com.example.kotlin2lesson6.presentation.exntensions.directionsSafeNavigation
import com.example.kotlin2lesson6.presentation.ui.adapters.MangaAdapter

class MangaFragment : BaseFragment<FragmentMangaBinding, MangaViewModel>(R.layout.fragment_manga) {
    override val binding by viewBinding(FragmentMangaBinding::bind)
    override val viewModel: MangaViewModel by viewModels()
    private val mangaAdapter = MangaAdapter(this::onClick)
    override fun assembleViews() {
        setupAdapter()
    }

    private fun setupAdapter() {
        binding.recyclerview.adapter = mangaAdapter
    }

    override fun launchObservers() {
        viewModel.fetchManga().spectatePaging(
            error = {
                Log.e("tag", it)
            },
            success = {
                mangaAdapter.submitData(it)
            }
        )

    }

    private fun onClick(id: String) {
        findNavController().directionsSafeNavigation(
            MangaFragmentDirections.actionMangaFragmentToMangaDetailedFragment(
                id
            )
        )
    }

}
