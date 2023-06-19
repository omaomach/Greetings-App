package com.omao.greetingsapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Step 2: Declaring Views
        val et1: EditText = findViewById(R.id.et1)
        val btn1: Button = findViewById(R.id.btn1)

        // Step 3: Adding Functionalities
        btn1.setOnClickListener() {
            val userInput = et1.text
            Toast.makeText(this,
                "Hello $userInput",
            Toast.LENGTH_LONG).show()
        }

    }
}