package com.woongs.fastclass_study_ui

import android.icu.number.IntegerWidth
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_calculator.*

class Calculator : AppCompatActivity() {

    var new = ""
    var old : String = "0"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calculator)

        val sum : TextView = findViewById(R.id.sum)

        number1.setOnClickListener {
            new = new + "1"
            sum.setText(new)
        }
        number2.setOnClickListener {
            new = new + "2"
            sum.setText(new)
        }
        number3.setOnClickListener {
            new = new + "3"
            sum.setText(new)
        }
        number4.setOnClickListener {
            new = new + "4"
            sum.setText(new)
        }
        number5.setOnClickListener {
            new = new + "5"
            sum.setText(new)
        }
        number6.setOnClickListener {
            new = new + "6"
            sum.setText(new)
        }
        number7.setOnClickListener {
            new = new + "7"
            sum.setText(new)
        }
        number8.setOnClickListener {
            new = new + "8"
            sum.setText(new)
        }
        number9.setOnClickListener {
            new = new + "9"
            sum.setText(new)
        }
        number0.setOnClickListener {
            new = new + "0"
            sum.setText(new)
        }

        CA.setOnClickListener {
            sum.setText("0")
        }

        plus.setOnClickListener {
            old = (old.toInt() + new.toInt()).toString()
            new = ""
            sum.setText(old)

        }
    }
}