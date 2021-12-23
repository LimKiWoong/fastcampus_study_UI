package com.woongs.fastclass_study_ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class NullSafety : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_null_safety)

        val number : Int = 10
        val number2 : Int? = null
        //var number3 = number? + number2
        val number3 = number2?.plus(number)

        //삼항 연산자 -> 엘비스 연산자(?:)행
        val number4 = number2 ?: 10
    }

    fun plus(a : Int , b : Int?) : Int{
        if( b != null){
            return a+b
        } else {
            return a
        }
    }

    fun plus2(a : Int, b : Int?) : Int?{
        return b?.plus(a)
    }
}