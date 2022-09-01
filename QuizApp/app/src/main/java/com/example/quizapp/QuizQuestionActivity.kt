package com.example.quizapp

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.ImageView
import android.widget.ProgressBar
import android.widget.TextView

class QuizQuestionActivity : AppCompatActivity() {

	private var tvQuestion: TextView? = null
	private var ivImage: ImageView? = null
	private var progressBar: ProgressBar? = null
	private var tvProgressBar: TextView? = null


	private var tvOptionOne: TextView? = null
	private var tvOptionTwo: TextView? = null
	private var tvOptionThree: TextView? = null
	private var tvOptionFour: TextView? = null

	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)
		setContentView(R.layout.activity_quiz_question)

		tvQuestion = findViewById(R.id.tvQuestion)
		ivImage = findViewById(R.id.ivImage)
		progressBar = findViewById(R.id.progressBar)
		tvProgressBar = findViewById(R.id.tvProgressBar)
		tvOptionOne = findViewById(R.id.tvOptionOne)
		tvOptionTwo = findViewById(R.id.tvOptionTwo)
		tvOptionThree = findViewById(R.id.tvOptionThree)
		tvOptionFour = findViewById(R.id.tvOptionFour)

		val questionList = Constants.getQuestions()
		Log.i("QuestionsList", "Questions list Size is ${questionList.size}")

		for (item in questionList) {
			Log.e("Question", item.id.toString())
		}

		var currentPosition = 1
		val question = questionList[currentPosition - 1]
		ivImage?.setImageResource(question.image)
		progressBar?.progress = currentPosition
		tvProgressBar?.text = "$currentPosition / ${progressBar?.max}"
		tvQuestion?.text = question.question
		tvOptionOne?.text = question.optionOne
		tvOptionTwo?.text = question.optionTwo
		tvOptionThree?.text = question.optionThree
		tvOptionFour?.text = question.optionFour
	}
}