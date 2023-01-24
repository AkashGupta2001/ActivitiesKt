package com.example.activitieskt

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity

class MyActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d("MyActivity", "onCreate()")
        setContentView(R.layout.activity_main)
    }
}