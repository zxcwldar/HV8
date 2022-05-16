package com.example.kotlin2lesson6.presentation.models.auth

import com.example.domain.models.auth.TokenModel


data class TokenUI(
    val accessToken: String,
    val createdAt: Long,
    val expiresIn: Int,
    val refreshToken: String,
    val scope: String,
    val tokenType: String
)

fun TokenModel.toUI() = TokenUI(accessToken, createdAt, expiresIn, refreshToken, scope, tokenType)