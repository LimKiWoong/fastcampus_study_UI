package com.woongs.fastclass_study_ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.FragmentManager
import kotlinx.android.synthetic.main.activity_fragment.*

class FragmentActivity : AppCompatActivity(), FragmentOne.OnDataPassListener {

    override fun onDataPass(data: String?) {
        Log.d("pass",""+data)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fragment)

        val fragmentOne : FragmentOne = FragmentOne()
        // 프레그먼트에 data를 넣어주는 방법 -> bundle
        val bundle : Bundle = Bundle()
        bundle.putString("hello","hello")
        fragmentOne.arguments = bundle


        button.setOnClickListener {
            val fragmentManager : FragmentManager = supportFragmentManager

            //Transaction
            // 작업의 단위 -> 시작과 끝이 있다
            // 시작
            val fragmentTransaction = fragmentManager.beginTransaction()
            fragmentTransaction.replace(R.id.container,fragmentOne)
            // 종료
            fragmentTransaction.commit()
            // 종료 하는 방법
            // commit    -> 시간될때  (좀더 안정적)
            // commitnow -> 지금당장
        }
        button2.setOnClickListener {
            val fragmentManager = supportFragmentManager
            val fragmentTransaction = fragmentManager.beginTransaction()
            fragmentTransaction.remove(fragmentOne)
            fragmentTransaction.commit()
            // detach
            // remove
        }

        Log.d("life_cycle","onCreate")
    }

    override fun onStart() {
        super.onStart()
        Log.d("life_cycle","onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.d("life_cycle","onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.d("life_cycle","onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.d("life_cycle","onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("life_cycle","onDestroy")
    }
}