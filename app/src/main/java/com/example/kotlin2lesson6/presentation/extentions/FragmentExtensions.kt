package com.example.kotlin2lesson6.presentation.extentions

import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import com.example.kotlin2lesson6.R


fun Fragment.mainNavController() = requireActivity().findNavController(R.id.nav_host_fragment)