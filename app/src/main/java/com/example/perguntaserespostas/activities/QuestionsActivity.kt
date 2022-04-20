package com.example.perguntaserespostas.activities

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.perguntaserespostas.models.QuestionModel
import com.example.perguntaserespostas.R
import com.example.perguntaserespostas.databinding.ActivityQuestionsBinding
import com.example.perguntaserespostas.fragments.QuestionFragment

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
        transaction.replace(R.id.frag_container, QuestionFragment(/* question */))
        transaction.commit()
    }

}