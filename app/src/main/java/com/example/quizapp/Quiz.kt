package com.example.quizapp

class Quiz(private var questNumber:Int,private var answer:String, private var intentNumber:Int) {

    private var score:Int = 0
    private var isCorrect :Boolean =false

    //setter
    fun setQuestionNumber(questionNumber: Int){
        this.questNumber = questionNumber
    }
   fun setAnswer(answer: String){
        this.answer =answer
    }
   fun setIntentNumber(intentNumber: Int){
        this.intentNumber =intentNumber
    }
    fun setScore(score:Int){
        this.score =score
    }

    //getter
    fun getQuestionNumber():Int{
        return questNumber
    }
    fun getAnswer():String{
        return answer
    }

    fun getIntentNumber():Int{
        return intentNumber
    }

    fun getScore():Int{
        return score
    }
    fun checkCorrectAnswer(){


        when(intentNumber){
            1->{
                (getAnswer()=="Italy").also { isCorrect = it }
                computeScore(isCorrect)


            }
            2->{
                (getAnswer()=="Nokia").also { isCorrect = it }
                computeScore(isCorrect)
            }
            3->{
                (getAnswer()=="Berlin").also { isCorrect = it }
                computeScore(isCorrect)
            }
            4->{
                (getAnswer()=="Rhubarb").also { isCorrect = it }
                computeScore(isCorrect)
            }
            5->{
                (getAnswer()=="China").also { isCorrect = it }
                computeScore(isCorrect)
            }
            6->{
                (getAnswer()=="South America").also { isCorrect = it }
                computeScore(isCorrect)
            }
            7->{
                (getAnswer()=="Russian").also { isCorrect = it }
                computeScore(isCorrect)

            }
            8->{
                (getAnswer()=="Entomophobia").also { isCorrect = it }
                computeScore(isCorrect)
            }
            9->{
                (getAnswer()=="Instagram").also { isCorrect = it }
                computeScore(isCorrect)
            }
            10->{
                (getAnswer()=="Ridley Scott").also { isCorrect = it }
                computeScore(isCorrect)
            }
        }
    }
    //process in computing score
    private fun computeScore(isCorrect:Boolean):Int{
            if(isCorrect){
                this.score += 1
                return score
                }
        else{
                this.score = score

        }
        return score
    }
}