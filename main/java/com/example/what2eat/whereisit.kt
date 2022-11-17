package com.example.what2eat

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class whereisit : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_whereisit)

        val display_title = findViewById<TextView>(R.id.textView8)
        val RandomText = intent.getStringExtra("RANDOMTEXT")

        display_title.text = RandomText

        val backButton = findViewById<Button>(R.id.button4)
        backButton.setOnClickListener {
            val Intent = Intent(this,MainActivity::class.java)
            startActivity(Intent)
        }
    }
}