package com.example.perguntaserespostas

class QuestionModel(
    val title: String = "",
    val alternatives: Array<String>,
    private var correctAnswer: Int,
    var id: String = ""
) {
    companion object {
        val testQuestion = QuestionModel(
            title = "PERGUNTA TESTE",
            alternatives = arrayOf(
                "Alternativa 1",
                "Alternativa 2",
                "Alternativa 3 (correta)",
                "Alternativa 4",
                "Alternativa 5",
            ),
            correctAnswer = 2
        )
    }

    fun correctAnswerId(): Int = correctAnswer
    fun getCorrectAnswer(): String = alternatives[correctAnswer]
    fun shuffleAnswers() {
        val correctAnswerStr = alternatives[correctAnswer]
        alternatives.shuffle()
        var i = 0
        while (i < alternatives.size) {
            if (alternatives[i] == correctAnswerStr) {
                this.correctAnswer = i
                break
            }
            i++
        }
    }
}