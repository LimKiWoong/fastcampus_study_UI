package com.woongs.fastclass_study_ui

import android.content.Context
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.fragment_one.*

class FragmentOne : Fragment(){

    interface OnDataPassListener {
        fun onDataPass(data : String?)
    }

    lateinit var dataPassListener : OnDataPassListener

    override fun onAttach(context: Context) {
        Log.d("life_cycle","F_onAttach")
        super.onAttach(context)
        dataPassListener = context as OnDataPassListener
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        Log.d("life_cycle","F_onCreate")
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        Log.d("life_cycle","F_onCreateView")
        // 프레그먼트가 인터페이스를 처음으로 그릴때 호출
        // inflater : 뷰를 그려주는 역할
        // container : 부모뷰
        return inflater.inflate(R.layout.fragment_one,container,false)
    }

    // Activity의 onCreate에서 했던 작업을 Fragment는 주로 이곳에 작업한다

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        Log.d("life_cycle","F_onViewCreated")
        super.onViewCreated(view, savedInstanceState)

        pass.setOnClickListener {
            dataPassListener.onDataPass("Good Bye")
        }
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        Log.d("life_cycle","F_onActivityCreated")
        val data = arguments?.getString("hello")
        if (data != null) {
            Log.d("data",data)
        }
        super.onActivityCreated(savedInstanceState)
    }

    override fun onStart() {
        Log.d("life_cycle","F_onStart")
        super.onStart()
    }

    override fun onResume() {
        Log.d("life_cycle","F_onResume")
        super.onResume()
    }

    override fun onPause() {
        Log.d("life_cycle","F_onPause")
        super.onPause()
    }

    override fun onStop() {
        Log.d("life_cycle","F_onStop")
        super.onStop()
    }

    override fun onDestroyView() {
        Log.d("life_cycle","F_onDestroyView")
        super.onDestroyView()
    }

    override fun onDetach() {
        Log.d("life_cycle","F_onDetach")
        super.onDetach()
    }
}