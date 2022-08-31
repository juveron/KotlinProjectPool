package com.example.quizapp

object Constants {
	fun getQuestions(): ArrayList<Question> {
		val questionsList = ArrayList<Question>()
		val questionOne = Question(
			1,
			"What country this flag belong to",
			R.drawable.ic_flag_of_argentina,
			"Argentina",
			"Australia",
			"Armenia",
			"Austria",
			1
		)

		questionsList.add(questionOne)
		return questionsList
	}
}