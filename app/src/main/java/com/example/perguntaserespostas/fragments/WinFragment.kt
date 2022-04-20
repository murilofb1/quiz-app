package com.example.perguntaserespostas.fragments

import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.perguntaserespostas.R
import com.example.perguntaserespostas.databinding.FragmentSplashBinding
import com.example.perguntaserespostas.helpers.NavigationHelper

class WinFragment : Fragment() {
    lateinit var binding: FragmentSplashBinding
    lateinit var nav: NavigationHelper.SplashNav
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentSplashBinding.bind(inflateView(inflater, container))
        nav = NavigationHelper(requireActivity()).SplashNav()
        Handler(Looper.getMainLooper()).postDelayed({
            nav.navigateToHome()
        }, 3000)
        return binding.root
    }

    private fun inflateView(inflater: LayoutInflater, container: ViewGroup?): View =
        inflater.inflate(R.layout.fragment_splash, container, false)
}