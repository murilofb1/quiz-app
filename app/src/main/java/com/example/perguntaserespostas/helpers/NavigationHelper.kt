package com.example.perguntaserespostas.helpers

import androidx.fragment.app.FragmentActivity
import androidx.navigation.fragment.NavHostFragment
import com.example.perguntaserespostas.R

class NavigationHelper(activity: FragmentActivity) {
    private val navHost =
        activity.supportFragmentManager.findFragmentById(R.id.nav_host_main) as NavHostFragment
    private val navController = navHost.navController

    inner class HomeNavigation {
        fun navigateToQuestion() =
            navController.navigate(R.id.home_to_question)
    }
}
