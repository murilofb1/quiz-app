package com.example.perguntaserespostas.fragments

import androidx.lifecycle.ViewModel
import com.example.perguntaserespostas.models.QuestionModel

class QuestionViewModel : ViewModel() {
    val list = listOf(
        QuestionModel.testQuestion,
        QuestionModel.testQuestion,
        QuestionModel.testQuestion,
        QuestionModel.testQuestion,
        QuestionModel.testQuestion
    )
    val currentQuestion = 0

    fun getCurrentQuestion(): QuestionModel =
        list[currentQuestion]
}