package com.example.what2eat

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView
import org.w3c.dom.Text
import java.lang.NullPointerException
import java.util.*
import kotlin.random.Random
import kotlin.random.Random.Default.nextInt

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button = findViewById<Button>(R.id.button)
        val result = findViewById<TextView>(R.id.textView2)
        val choice1 = findViewById<EditText>(R.id.editTextTextPersonName)
        val choice2 = findViewById<EditText>(R.id.editTextTextPersonName2)
        val choice3 = findViewById<EditText>(R.id.editTextTextPersonName3)

        val whereisitButton = findViewById<Button>(R.id.button3)

        val resetButton = findViewById<Button>(R.id.button2)

        button.setOnClickListener {
            val list = mutableListOf(choice1, choice2, choice3)
            val randomInt = (0 until (list.size)).random()
            val randomText = list[randomInt].text.toString()

            result.text = randomText

        whereisitButton.setOnClickListener {
            startActivity(Intent(this, whereisit::class.java)
                .putExtra("RANDOMTEXT", randomText))
        }}
        resetButton.setOnClickListener {
            choice1.setText("")
            choice2.setText("")
            choice3.setText("")
            result.text = ""
        }
    }
}