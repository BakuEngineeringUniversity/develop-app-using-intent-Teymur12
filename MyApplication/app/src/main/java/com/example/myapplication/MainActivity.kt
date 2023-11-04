package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Set a click listener for a button

    }

    fun btnClick(view: View) {
        val intent = Intent(this, MainActivity2::class.java)
        intent.putExtra("key", "Hello, Second Activity!")
        startActivity(intent)
    }
}
