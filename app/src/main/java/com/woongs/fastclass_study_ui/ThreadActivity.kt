package com.woongs.fastclass_study_ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_thread.*

class ThreadActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_thread)

        // ## 방법1.

        val runnable : Runnable = object : Runnable{
            override fun run() {
                Log.d("첫번째 방법으로 thread실행","실행중입니다.")
            }
        }

        val thread : Thread = Thread(runnable)

        btn01.setOnClickListener {
            thread.start()
        }






        // ## 방법2.

        Thread(object : Runnable {
            override fun run() {
                Log.d("2번째방법으로 thread 실행","실행중입니다.")
            }
        }).start()






        // ## 방법3. 람다방식으로 실행

        Thread(Runnable {
            Log.d("3번째방법으로 thread실행","실행중입니다.")
        }).start()

        // 위 방법으로 생성한 스레드로 UI 부분은 건들지 못한다! crash가 난다.
        // ## 방법4. 메인스레드를 이용하여 UI건들어보기

        Thread(Runnable {
            Thread.sleep(3000) //3초동안 슬립
            Log.d("4번째방법으로 thread실행","실행중입니다.")
            runOnUiThread {
                btn01.setBackgroundColor(getColor(R.color.design_default_color_primary))
            }
        }).start()

    }
}