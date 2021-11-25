package com.woongs.fastclass_study_ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView

class Listener : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_listener)

        val textView : TextView = findViewById(R.id.hello)
        textView.setOnClickListener {
            Log.d("click","Click!")

        }

    }
}