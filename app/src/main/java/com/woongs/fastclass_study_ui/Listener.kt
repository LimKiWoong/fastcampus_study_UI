package com.woongs.fastclass_study_ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_listener.*

class Listener : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_listener)

//        val textView : TextView = findViewById(R.id.hello)
//        textView.setOnClickListener {
//            Log.d("click","Click!")
//
//        }

        hello.setOnClickListener {
            Log.d("click","Click!")
            hello.setText("안녕하세요")
        }
        image.setImageResource(R.drawable.minion)
    }
}