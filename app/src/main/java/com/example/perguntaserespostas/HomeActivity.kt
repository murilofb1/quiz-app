package com.example.perguntaserespostas

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.perguntaserespostas.databinding.ActivityHomeBinding

class HomeActivity : AppCompatActivity() {
    private lateinit var binding: ActivityHomeBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHomeBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.btnStart.setOnClickListener {
            startActivity(Intent(this, QuestionsActivity::class.java))
        }
        binding.btnFinish.setOnClickListener {
            finishAffinity()
        }

    }

    override fun onStart() {
        super.onStart()
        binding.txtViewLastPoints.text = "Pontos na última rodada:\n" +
                "${PointsUtil.getLastRoundPoints()}"
    }
}