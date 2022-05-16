package com.example.kotlin2lesson6.presentation.extentions

import android.widget.ImageView
import com.bumptech.glide.Glide

fun ImageView.loadImageWithGlide(url: String?) = Glide.with(this).load(url).into(this)
