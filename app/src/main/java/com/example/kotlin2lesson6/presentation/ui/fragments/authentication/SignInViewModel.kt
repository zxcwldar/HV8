package com.example.kotlin2lesson6.presentation.ui.fragments.authentication

import com.example.domain.usecase.SignInUseCase
import com.example.kotlin2lesson6.base.BaseViewModel
import com.example.kotlin2lesson6.presentation.models.auth.TokenUI
import com.example.kotlin2lesson6.presentation.models.auth.toUI
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.asStateFlow
import javax.inject.Inject

@HiltViewModel
class SignInViewModel @Inject constructor(
    private val signInUseCase: SignInUseCase
) : BaseViewModel() {
    private val _signInState = mutableUiStateFlow<TokenUI>()
    val signInState = _signInState.asStateFlow()

    fun signIn(username: String, password: String) =
        signInUseCase(username, password).gatherRequest(_signInState) { it.toUI() }
}