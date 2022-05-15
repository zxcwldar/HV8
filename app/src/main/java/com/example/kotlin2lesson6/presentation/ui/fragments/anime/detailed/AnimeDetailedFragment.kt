package com.example.kotlin2lesson6.presentation.ui.fragments.anime.detailed

import android.util.Log
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.navArgs
import by.kirich1409.viewbindingdelegate.viewBinding
import com.example.kotlin2lesson6.R
import com.example.kotlin2lesson6.base.BaseFragment
import com.example.kotlin2lesson6.common.extentions.setImage
import com.example.kotlin2lesson6.databinding.FragmentAnimeDetailedBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class AnimeDetailedFragment :
    BaseFragment<FragmentAnimeDetailedBinding, AnimeDetailedViewModel>(R.layout.fragment_anime_detailed) {
    override val binding by viewBinding(FragmentAnimeDetailedBinding::bind)
    override val viewModel: AnimeDetailedViewModel by viewModels()
    private val args: AnimeDetailedFragmentArgs by navArgs()


    override fun establishRequest() {
        viewModel.fetchADetailedAnime(args.animeId)
    }

    override fun launchObservers() {
        subscribeToAnimeDetailed()

    }

    private fun subscribeToAnimeDetailed() {
        viewModel.animeDetailedState.spectateUiState(success = {
            binding.apply {

                it.apply {
                    imCover.setImage(data.animeDto.coverImage?.original)
                    imPoster.setImage(data.animeDto.posterImage?.medium)
                    tvSubtype.text = data.animeDto.subtype?.uppercase()
                    tvYear.text = data.animeDto.createdAt
                    tvTitle.text = data.animeDto.titles?.en
                    tvSynopsis.text = data.animeDto.synopsis
                    tvAverageRating.text = "${data.animeDto.averageRating}%"
                    tvRating.text = "Rank #${data.animeDto.ratingRank}"
                    tvPopularity.text = "Rank #${data.animeDto.popularityRank}"

                }


            }


        }, error = { Log.e("tag", it) }
        )
    }


}