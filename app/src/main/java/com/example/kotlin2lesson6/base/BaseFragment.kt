package com.example.kotlin2lesson6.base

import android.os.Bundle
import android.view.View
import androidx.annotation.LayoutRes
import androidx.fragment.app.Fragment
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.lifecycleScope
import androidx.lifecycle.repeatOnLifecycle
import androidx.paging.PagingData
import androidx.viewbinding.ViewBinding
import com.example.kotlin2lesson6.presentation.ui.state.UiState
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.collectLatest
import kotlinx.coroutines.launch


abstract class BaseFragment<Binding : ViewBinding, ViewModel : BaseViewModel>(@LayoutRes layoutId: Int) :
    Fragment(
        layoutId
    ) {
    protected abstract val binding: Binding
    protected abstract val viewModel: ViewModel
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initialize()
        assembleViews()
        setupListeners()
        establishRequest()
        launchObservers()

    }

    protected open fun initialize() {
    }

    protected open fun assembleViews() {
    }

    protected open fun setupListeners() {
    }


    protected open fun establishRequest() {

    }

    protected open fun launchObservers() {

    }
    protected fun <T : Any> Flow<PagingData<T>>.spectatePaging(
        lifecycleState: Lifecycle.State = Lifecycle.State.STARTED,
        success: suspend (data: PagingData<T>) -> Unit,
        error: ((error: String) -> Unit)? = null
    ) {
        safeFlowGather(lifecycleState) {
            collectLatest {
                success(it)
                error(it)
            }
        }
    }

    protected fun <T> StateFlow<UiState<T>>.spectateUiState(
        lifecycleState: Lifecycle.State = Lifecycle.State.STARTED,
        success: ((data: T) -> Unit)? = null,
        loading: ((data: UiState.Loading<T>) -> Unit)? = null,
        error: ((error: String) -> Unit)?,
        idle: ((idle: UiState.Idle<T>) -> Unit)? = null,
        gatherIfSucceed: ((state: UiState<T>) -> Unit)? = null
    ) {
        safeFlowGather(lifecycleState) {
            collect {
                gatherIfSucceed?.invoke(it)
                when (it) {
                    is UiState.Idle -> {
                        idle?.invoke(it)
                    }
                    is UiState.Loading -> {
                        loading?.invoke(it)
                    }
                    is UiState.Error -> {
                        error?.invoke(it.error)
                    }
                    is UiState.Success -> {
                        success?.invoke(it.data)
                    }
                }
            }

        }

    }

    private fun safeFlowGather(
        lifecycleState: Lifecycle.State,
        gather: suspend () -> Unit
    ) {
        viewLifecycleOwner.lifecycleScope.launch {
            viewLifecycleOwner.repeatOnLifecycle(lifecycleState) {
                gather()
            }
        }
    }

}