package com.example.homework10052021

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class Constraint : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.constraint_layout)
        title = "HomeWork"
        val button: Button = findViewById(R.id.btnOne)
        button.setOnClickListener {
            val b = Intent(this@Constraint, MainActivity::class.java)
            startActivity(b)
        }
    }
}