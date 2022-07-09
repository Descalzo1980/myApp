package com.raywenderlich.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        Log.i("MyTag","SecondActivity: OnCreate")
        val userName = intent.getStringExtra("USER")
        val textView = findViewById<TextView>(R.id.tvOffer)
        val message = "$userName, тебе повезло, всё бесплатно и навсегда, и пусть никто не уйдет обиженным"
        textView.text = message
    }
    override fun onStart() {
        super.onStart()
        Log.i("MyTag","SecondActivity: onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.i("MyTag","SecondActivity: onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.i("MyTag","SecondActivity: onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.i("MyTag","SecondActivity: onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i("MyTag","SecondActivity: onDestroy")
    }

    override fun onRestart() {
        super.onRestart()
        Log.i("MyTag","SecondActivity: onRestart")
    }
}