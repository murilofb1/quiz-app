package com.example.perguntaserespostas

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.perguntaserespostas.databinding.ActivityQuestionsBinding

class QuestionsActivity : AppCompatActivity() {
    private lateinit var binding: ActivityQuestionsBinding
    val question = QuestionModel.testQuestion

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityQuestionsBinding.inflate(layoutInflater)
        setContentView(binding.root)
        fragmentTransaction()
    }

    fun fragmentTransaction() {
        val transaction = supportFragmentManager.beginTransaction()
        transaction.replace(R.id.frag_container, QuestionFragment(question))
        transaction.commit()
    }

}