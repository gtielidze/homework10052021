package com.example.homework10052021

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class Linear : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.linear_layout)
        title = "HomeWork"
        val button: Button = findViewById(R.id.linearBtnOne)
        button.setOnClickListener {
            val i = Intent(this@Linear, MainActivity::class.java)
            startActivity(i)
        }
    }

}