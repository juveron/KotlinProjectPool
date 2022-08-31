package com.example.quizapp

object Constants {
	fun getQuestions(): ArrayList<Question> {
		val questionsList = ArrayList<Question>()
		val question01 = Question(
			1,
			"What country this flag belong to",
			R.drawable.ic_flag_of_argentina,
			"Argentina",
			"Australia",
			"Armenia",
			"Austria",
			1
		)
		questionsList.add(question01)
		val question02 = Question(
			2,
			"What country this flag belong to",
			R.drawable.ic_flag_of_australia,
			"Russia",
			"China",
			"United State",
			"Australia",
			4
		)
		questionsList.add(question02)
		val question03 = Question(
			3,
			"What country this flag belong to",
			R.drawable.ic_flag_of_belgium,
			"Germany",
			"Belgium",
			"Ukraine",
			"The losers",
			2
		)
		questionsList.add(question03)
		val question04 = Question(
			4,
			"What country this flag belong to",
			R.drawable.ic_flag_of_brazil,
			"Homophobia land",
			"France",
			"Russia",
			"Brazil",
			4
		)
		questionsList.add(question04)
		val question05 = Question(
			5,
			"What country this flag belong to",
			R.drawable.ic_flag_of_denmark,
			"Denmark",
			"France",
			"England",
			"Answer 4",
			1
		)
		questionsList.add(question05)
		val question06 = Question(
			6,
			"What country this flag belong to",
			R.drawable.ic_flag_of_fiji,
			"Fiji",
			"India",
			"New Zealand",
			"Austria",
			1
		)
		questionsList.add(question06)
		val question07 = Question(
			7,
			"What country this flag belong to",
			R.drawable.ic_flag_of_germany,
			"Kebab",
			"Austria",
			"Germany",
			"Belgium",
			3
		)
		questionsList.add(question07)
		val question08 = Question(
			8,
			"What country this flag belong to",
			R.drawable.ic_flag_of_india,
			"Argentina",
			"India",
			"Armenia",
			"Belgium",
			2
		)
		questionsList.add(question08)
		val question09 = Question(
			9,
			"What country this flag belong to",
			R.drawable.ic_flag_of_kuwait,
			"France",
			"Kuwait",
			"Congo",
			"Marseille",
			2
		)
		questionsList.add(question09)
		val question10 = Question(
			10,
			"What country this flag belong to",
			R.drawable.ic_flag_of_new_zealand,
			"New Zealand",
			"Middle Earth",
			"Rohan",
			"Turkish",
			1
		)
		questionsList.add(question10)
		return questionsList
	}
}