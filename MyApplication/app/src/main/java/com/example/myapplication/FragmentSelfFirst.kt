package com.example.myapplication

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment


class FragmentSelfFirst: Fragment(){

    // Fragment가 인터페이스를 처음으로 그릴 때 onCreateView() 호출 됨
    override fun onCreateView(
        inflater: LayoutInflater,   // inflater -> 뷰를 그려주는 역할
        container: ViewGroup?,  // container -> 부모뷰
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_self_first, container,false)
    }

}