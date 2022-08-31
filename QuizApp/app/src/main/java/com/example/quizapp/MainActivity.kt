package com.example.quizapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)
		setContentView(R.layout.activity_main)

		val btnStart: Button = findViewById(R.id.btnStart)
		val inputText: EditText = findViewById(R.id.inputName)

		btnStart.setOnClickListener {
			if (inputText.text.isNotEmpty()) {
				val intent = Intent(this, QuizQuestionActivity::class.java)
				startActivity(intent)
			} else {
				Toast.makeText(this,
					"Please enter your name", Toast.LENGTH_LONG).show()
			}
		}

	}
}