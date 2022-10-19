package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        val textView: TextView = findViewById(R.id.editTextTextPersonName2)
        val editText: TextView = findViewById(R.id.editTextNumber2)
        val editText1: TextView = findViewById(R.id.editTextTextEmailAddress2)
        // создание Bundle с содержимым переданным при запуске Activity
        val arguments: Bundle? = intent.extras
        // проверка arguments на null
        if (arguments != null){
            val name: String = arguments.get("name").toString()
            val email: String? = arguments.getString("email")
            val age: Int = arguments.getInt("age")
            textView.text = "$name"
            editText.text = "$age"
            editText1.text = "$email"


        }

    }

    fun OnClicks(view: View) {
        val nameText: TextView = findViewById(R.id.editTextTextPersonName2)
        val ageText: TextView = findViewById(R.id.editTextNumber2)
        val emailText: TextView = findViewById(R.id.editTextTextEmailAddress2)
        val name = nameText.text.toString()
        val age = ageText.text.toString().toInt()
        val email = emailText.text.toString()
        val intent: Intent =
            Intent(this@SecondActivity, MainActivity::class.java)

        intent.putExtra("name", name)
        intent.putExtra("age", age)
        intent.putExtra("email", email)
        startActivity(intent)
    }
}