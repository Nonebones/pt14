package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val textView1: TextView = findViewById(R.id.editTextTextPersonName)
        val editText2: TextView = findViewById(R.id.editTextNumber)
        val editText3: TextView = findViewById(R.id.editTextTextEmailAddress)
        // создание Bundle с содержимым переданным при запуске Activity
        val arguments: Bundle? = intent.extras
        // проверка arguments на null
        if (arguments != null){
            val name: String = arguments.get("name").toString()
            val email: String? = arguments.getString("email")
            val age: Int = arguments.getInt("age")

            textView1.text = "$name"
            editText2.text = "$age"
            editText3.text = "$email"


        }

    }
    fun OnClick(view: View){

        val nameText: TextView = findViewById(R.id.editTextTextPersonName)
        val ageText: TextView = findViewById(R.id.editTextNumber)
        val emailText: TextView = findViewById(R.id.editTextTextEmailAddress)
        val name = nameText.text.toString()
        val age = ageText.text.toString().toInt()
        val email = emailText.text.toString()
        val intent: Intent =
            Intent(this@MainActivity, SecondActivity::class.java)

        intent.putExtra("name", name)
        intent.putExtra("age", age)
        intent.putExtra("email", email)

        startActivity(intent)


    }
}