package com.example.myapplication

import android.content.Context
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.fragment_one.*


class FragmentOne: Fragment() {

    interface OnDataPassLinstener{    // ※ interface라 생성자 없다.
            fun onDataPass(data: String?)
    }

    lateinit var dataPassLinster: OnDataPassLinstener   // lateinit 으로 변수 초기화를 뒤로 미룸


    override fun onAttach(context: Context?) {
        Log.d("life_cycle[2]","onAttach")
        super.onAttach(context)

        dataPassLinster = context as OnDataPassLinstener    // context 를 OnDataPassLinstener 로 형변환

    }

    override fun onCreate(savedInstanceState: Bundle?) {
        Log.d("life_cycle[2]","onCreate")
        super.onCreate(savedInstanceState)
    }

    // View를 그리는 역할
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        Log.d("life_cycle[2]","onCreateView")

        // Fragment가 인터페이스를 처음으로 그릴 때 onCreateView() 호출 됨
        // inflater -> 뷰를 그려주는 역할
        // container -> 부모뷰
        return  inflater.inflate(R.layout.fragment_one, container, false )

    }

    // Activity 에서는 onCreate() 부분에 메인 로직을 작성했다면
    // Fragment 에서는 onViewCreated() 부분에 메인 로직을 작성
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        Log.d("life_cycle[2]","onViewCreated")
        super.onViewCreated(view, savedInstanceState)

        pass.setOnClickListener {
            dataPassLinster.onDataPass("Good Bye")
        }
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        Log.d("life_cycle[2]","onActivityCreated")

        val date = arguments?.getString("Hello")

        Log.d("life_cycle[2]","onActivityCreated data :: " + date)

        super.onActivityCreated(savedInstanceState)
    }

    override fun onStart() {
        Log.d("life_cycle[2]","onStart")
        super.onStart()
    }

    override fun onResume() {
        Log.d("life_cycle[2]","onResume")
        super.onResume()
    }

    override fun onPause() {
        Log.d("life_cycle[2]","onPause")
        super.onPause()
    }

    override fun onStop() {
        Log.d("life_cycle[2]","onStop")
        super.onStop()
    }

    override fun onDestroyView() {
        Log.d("life_cycle[2]","onDestroyView")
        super.onDestroyView()
    }

    override fun onDetach() {
        Log.d("life_cycle[2]","onDetach")
        super.onDetach()
    }
}