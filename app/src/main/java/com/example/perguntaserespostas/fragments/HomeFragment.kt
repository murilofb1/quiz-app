package com.example.perguntaserespostas.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.NavHostFragment
import com.example.perguntaserespostas.R
import com.example.perguntaserespostas.databinding.FragmentHomeBinding
import com.example.perguntaserespostas.helpers.NavigationHelper

class HomeFragment : Fragment() {
    lateinit var binding: FragmentHomeBinding
    lateinit var nav: NavigationHelper.HomeNavigation

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflateView(inflater, container)
        binding = FragmentHomeBinding.bind(view)
        nav = NavigationHelper(requireActivity()).HomeNavigation()
        nav.navigateToQuestion()
        return binding.root
    }

    private fun inflateView(inflater: LayoutInflater, container: ViewGroup?): View =
        inflater.inflate(R.layout.fragment_home, container, false)


}