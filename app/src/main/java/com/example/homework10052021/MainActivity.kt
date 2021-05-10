package com.example.homework10052021

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        title = "KotlinApp"
        val linearButton: Button = findViewById(R.id.loadLinear)
        linearButton.setOnClickListener {
            val intent = Intent(this@MainActivity, Linear::class.java)
            startActivity(intent)
        }

        title = "KotlinApp"
        val constraintButton: Button = findViewById(R.id.loadConstraint)
        constraintButton.setOnClickListener {
            val intent = Intent(this@MainActivity, Constraint::class.java)
            startActivity(intent)
        }
    }
}






