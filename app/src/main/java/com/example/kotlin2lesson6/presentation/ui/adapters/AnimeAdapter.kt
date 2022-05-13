package com.example.kotlin2lesson6.presentation.ui.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.kotlin2lesson6.base.BaseDiffUtil
import com.example.kotlin2lesson6.common.extentions.setImage
import com.example.kotlin2lesson6.databinding.ItemAnimeBinding
import com.example.kotlin2lesson6.presentation.models.anime.DataModelUI

class AnimeAdapter :
    ListAdapter<DataModelUI, AnimeAdapter.AnimeViewHolder>(BaseDiffUtil()) {
    class AnimeViewHolder(private val binding: ItemAnimeBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun onBind(ui: DataModelUI) {
            binding.imImage.setImage(ui.attributes?.posterImage?.original)
            binding.tvTitle.text = ui.attributes?.titles?.en


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

