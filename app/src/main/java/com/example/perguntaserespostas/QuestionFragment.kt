package com.example.perguntaserespostas

import android.content.DialogInterface
import android.opengl.Visibility
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.view.get
import androidx.fragment.app.Fragment
import com.example.perguntaserespostas.databinding.FragmentQuestionBinding
import com.google.android.material.dialog.MaterialAlertDialogBuilder

class QuestionFragment(val question: QuestionModel) : Fragment() {
    private lateinit var binding: FragmentQuestionBinding
    var answerRevealed = false

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentQuestionBinding.bind(
            inflater.inflate(
                R.layout.fragment_question,
                container,
                false
            ),
        )
        question.shuffleAnswers()
        binding.txtViewTitle.text = question.title
        binding.radioAlternative1.text = question.alternatives[0]
        binding.radioAlternative2.text = question.alternatives[1]
        binding.radioAlternative3.text = question.alternatives[2]
        binding.radioAlternative4.text = question.alternatives[3]
        binding.radioAlternative5.text = question.alternatives[4]

        binding.btnSend.setOnClickListener {
            val dialog = MaterialAlertDialogBuilder(requireContext())
            if (getCheckedRadioButton() == question.correctAnswerId()) {
                dialog.apply {
                    setTitle("Certa Resposta! 🥳")
                    setNegativeButton("Parar", object : DialogInterface.OnClickListener {
                        override fun onClick(p0: DialogInterface?, p1: Int) {
                            PointsUtil.updateLastPoints()
                            requireActivity().finish()
                        }

                    })
                    setPositiveButton("Continuar", object : DialogInterface.OnClickListener {
                        override fun onClick(p0: DialogInterface?, p1: Int) {
                            val nani = requireActivity() as QuestionsActivity
                            nani.fragmentTransaction()

                        }
                    })

                }
                if (!answerRevealed) PointsUtil.updateRoundPoints()
            } else {
                dialog.apply {
                    setTitle("Resposta Errada! 😢")
                    setMessage(
                        "A resposta correta era:\n" +
                                "${question.getCorrectAnswer()}"
                    )
                    setNeutralButton("Recomeçar", object : DialogInterface.OnClickListener {
                        override fun onClick(p0: DialogInterface?, p1: Int) {
                            PointsUtil.updateLastPoints()
                            requireActivity().finish()

                        }

                    })
                }
            }
            dialog.show()
            answerRevealed = true
        }
        return binding.root
    }

    fun getCheckedRadioButton(): Int {
        return when {
            binding.radioAlternative1.isChecked -> 0
            binding.radioAlternative2.isChecked -> 1
            binding.radioAlternative3.isChecked -> 2
            binding.radioAlternative4.isChecked -> 3
            else -> 4
        }

    }
}