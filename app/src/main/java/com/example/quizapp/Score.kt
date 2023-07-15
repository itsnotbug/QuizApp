package com.example.quizapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.quizapp.databinding.ActivityScoreBinding

class Score : AppCompatActivity() {
    private lateinit var binding: ActivityScoreBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityScoreBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val bundle = intent.extras
        var getQuestionNumber: Int = bundle?.getInt("EXTRA_QUESTION_NUMBER") ?: 0
        val getScore: Int = bundle?.getInt("EXTRA_SCORE") ?: 0
        getQuestionNumber += 1

        binding.txtViewTotalDisplay.text ="$getScore / $getQuestionNumber "

    }
}