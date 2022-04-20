package com.example.perguntaserespostas.helpers

import androidx.fragment.app.FragmentActivity
import androidx.navigation.fragment.NavHostFragment
import com.example.perguntaserespostas.R

class NavigationHelper(activity: FragmentActivity) {
    private val navHost =
        activity.supportFragmentManager.findFragmentById(R.id.nav_host_main) as NavHostFragment
    private val navController = navHost.navController

    inner class HomeNav {
        fun navigateToQuestion() =
            navController.navigate(R.id.home_to_question)
    }

    inner class SplashNav {
        fun navigateToHome() =
            navController.navigate(R.id.splash_to_home)
    }

    inner class QuestionNav {
        fun navigateToWin() =
            navController.navigate(R.id.question_to_win)

        fun navigateToLoose() =
            navController.navigate(R.id.question_to_loose)

        fun navigateToNextQuestion() =
            navController.navigate(R.id.question_to_question)
    }

}
