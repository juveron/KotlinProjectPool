package com.example.quizapp

import android.annotation.SuppressLint
import android.graphics.Color
import android.graphics.Typeface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.ProgressBar
import android.widget.TextView
import androidx.core.content.ContextCompat

class QuizQuestionActivity : AppCompatActivity(), View.OnClickListener {

	private var mCurrentPosition: Int = 1
	private var mQuestionList: ArrayList<Question>? = null
	private var mSelectedOptionPosition: Int = 0

	private var tvQuestion: TextView? = null
	private var ivImage: ImageView? = null
	private var progressBar: ProgressBar? = null
	private var tvProgressBar: TextView? = null


	private var tvOptionOne: TextView? = null
	private var tvOptionTwo: TextView? = null
	private var tvOptionThree: TextView? = null
	private var tvOptionFour: TextView? = null

	private var btnSubmit: Button? = null

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
		btnSubmit = findViewById(R.id.btnSubmit)

		tvOptionOne?.setOnClickListener(this)
		tvOptionTwo?.setOnClickListener(this)
		tvOptionThree?.setOnClickListener(this)
		tvOptionFour?.setOnClickListener(this)
		btnSubmit?.setOnClickListener(this)

		mQuestionList = Constants.getQuestions()

		setQuestion()
	}

	private fun setQuestion() {
		val question = mQuestionList!![mCurrentPosition - 1]
		ivImage?.setImageResource(question.image)
		progressBar?.progress = mCurrentPosition
		tvProgressBar?.text = "$mCurrentPosition / ${progressBar?.max}"
		tvQuestion?.text = question.question
		tvOptionOne?.text = question.optionOne
		tvOptionTwo?.text = question.optionTwo
		tvOptionThree?.text = question.optionThree
		tvOptionFour?.text = question.optionFour

		if (mCurrentPosition == mQuestionList!!.size) {
			btnSubmit?.text = "FINISH"
		} else {
			btnSubmit?.text = "NEXT"
		}
	}

	private fun defaultOptionsView () {
		val options = ArrayList<TextView>()
		tvOptionOne?.let {
			options.add(0, it)
		}
		tvOptionTwo?.let {
			options.add(1, it)
		}
		tvOptionThree?.let {
			options.add(2, it)
		}
		tvOptionFour?.let {
			options.add(3, it)
		}

		for(option in options) {
			option.setTextColor(Color.parseColor("#7A8089"))
			option.typeface = Typeface.DEFAULT
			option.background = ContextCompat.getDrawable(
				this,
				R.drawable.default_option_border_bg
			)
		}
	}

	private fun selectedOptionsView(tv: TextView, selectedOptionNumb: Int ) {
		defaultOptionsView()

		mSelectedOptionPosition = selectedOptionNumb

		tv.setTextColor(Color.parseColor("#363A43"))
		tv.setTypeface(tv.typeface, Typeface.BOLD )

		tv.background = ContextCompat.getDrawable(
			this,
			R.drawable.selected_option_border_bg
		)
	}

	override fun onClick(view: View?) {
		when(view?.id) {
			R.id.tvOptionOne -> {
				tvOptionOne?.let {
					selectedOptionsView(it, 1)
				}
			}
			R.id.tvOptionTwo -> {
				tvOptionTwo?.let {
					selectedOptionsView(it, 2)
				}
			}
			R.id.tvOptionThree -> {
				tvOptionThree?.let {
					selectedOptionsView(it, 3)
				}
			}
			R.id.tvOptionFour -> {
				tvOptionFour?.let {
					selectedOptionsView(it, 4)
				}
			}
		}
	}
}