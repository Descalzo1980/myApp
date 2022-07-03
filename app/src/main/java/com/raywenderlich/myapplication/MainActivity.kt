package com.raywenderlich.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
            val greetingTextView = findViewById<TextView>(R.id.tvHello)
            val inputField = findViewById<EditText>(R.id.etNAme)
            val submitButton = findViewById<Button>(R.id.btnSubmit)

        submitButton.setOnClickListener {
            val enteredName = inputField.text.toString()
            if(enteredName == ""){
                Toast.makeText(
                    this@MainActivity,
                    "Нужно ввести имя",
                    Toast.LENGTH_SHORT
                ).show()
            }else{
                val message = "Welcome $enteredName"
                greetingTextView.text = message
                inputField.text.clear()
            }
        }

    }
}