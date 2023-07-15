package com.example.quizapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.RadioButton
import com.example.quizapp.databinding.ActivityQuizFourBinding

class QuizFour : AppCompatActivity() {
    private lateinit var binding: ActivityQuizFourBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityQuizFourBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val bundle = intent.extras
        var getIntentNumber = bundle?.getInt("EXTRA_INTENT_NUMBER")
        var getQuestionNumber: Int = bundle?.getInt("EXTRA_QUESTION_NUMBER") ?: 0
        var getScore: Int = bundle?.getInt("EXTRA_SCORE") ?: 0
        getIntentNumber = getIntentNumber?.plus(1)
        getQuestionNumber += 1
        binding.txtQuestionNumber.text = "Question Number $getQuestionNumber"

        binding.btnSubmit.setOnClickListener {
            val id = binding.radioGroupFour.checkedRadioButtonId
            val radioButton: RadioButton = binding.root.findViewById(id)
            val answer: String = radioButton.text.toString()
            val quiz = getIntentNumber?.let { it1 -> Quiz(getQuestionNumber, answer, it1) }

            //setting previous score
            quiz?.setScore(getScore)
            //Check if answer is correct
            quiz?.checkCorrectAnswer()
            val myIntent = Intent(this, QuizFive::class.java)
            val extras = Bundle()
            extras.putInt("EXTRA_INTENT_NUMBER", quiz?.getIntentNumber() ?: 0)
            extras.putInt("EXTRA_QUESTION_NUMBER", quiz?.getQuestionNumber() ?: 0)
            extras.putInt("EXTRA_SCORE", quiz?.getScore() ?: 0)
            myIntent.putExtras(extras)
            startActivity(myIntent)
        }
    }
}