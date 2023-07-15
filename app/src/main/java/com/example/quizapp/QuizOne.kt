package com.example.quizapp

import android.content.Intent
import android.os.Bundle
import android.widget.RadioButton
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.quizapp.databinding.ActivityQuizOneBinding
import com.example.quizapp.databinding.ActivityQuizTwoBinding

class QuizOne : AppCompatActivity() {
    private lateinit var binding:ActivityQuizOneBinding
    private var questionNumber=1
    private var intentNumber=1
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityQuizOneBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.txtQuestionNumber.text = "Question Number $questionNumber"
        binding.btnSubmit.setOnClickListener {
            val id = binding.radioGroupOne.checkedRadioButtonId
            val radioButton: RadioButton = binding.root.findViewById(id)
            val answer:String = radioButton.text.toString()
            val quiz =Quiz(questionNumber,answer,intentNumber)

            //Check if answer is correct
            quiz.checkCorrectAnswer()
            val myIntent = Intent(this,QuizTwo::class.java)
            val extras = Bundle()
            extras.putInt("EXTRA_INTENT_NUMBER", quiz.getIntentNumber())
            extras.putInt("EXTRA_QUESTION_NUMBER",quiz.getQuestionNumber())
            extras.putInt("EXTRA_SCORE",quiz.getScore())
            myIntent.putExtras(extras)
            startActivity(myIntent)
                }
            }
        }


