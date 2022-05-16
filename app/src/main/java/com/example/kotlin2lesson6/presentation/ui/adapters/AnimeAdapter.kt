package com.example.kotlin2lesson6.presentation.ui.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.paging.PagingDataAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.kotlin2lesson6.base.BaseDiffUtil
import com.example.kotlin2lesson6.databinding.ItemAnimeBinding
import com.example.kotlin2lesson6.presentation.extentions.loadImageWithGlide
import com.example.kotlin2lesson6.presentation.models.anime.AnimeDataUI

class AnimeAdapter(
    private val onClick: (id: String) -> Unit
) :
    PagingDataAdapter<AnimeDataUI, AnimeAdapter.AnimeViewHolder>(BaseDiffUtil()) {
    inner class AnimeViewHolder(private val binding: ItemAnimeBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun onBind(animeDataDto: AnimeDataUI) {
            binding.imImage.loadImageWithGlide(animeDataDto.animeDto.posterImage?.original)

            binding.root.setOnClickListener {
                onClick(animeDataDto.id)
            }




        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AnimeViewHolder {
        return AnimeViewHolder(
            (ItemAnimeBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            ))
        )
    }

    override fun onBindViewHolder(holder: AnimeViewHolder, position: Int) {
        getItem(position)?.let { holder.onBind(it) }

    }

}

