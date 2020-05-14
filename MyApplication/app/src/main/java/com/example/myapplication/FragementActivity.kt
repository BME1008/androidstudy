package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.FragmentManager
import kotlinx.android.synthetic.main.activity_fragement.*

class FragementActivity : AppCompatActivity(), FragmentOne.OnDataPassLinstener {

    // FragmentOne.OnDataPassLinstener 인터페이스를 반듯이 재정의
    override fun onDataPass(data: String?) {
        Log.d("pass","data :: " + data)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fragement)

        Log.d("life_cycle","onCreate")

        val fragmentOne: FragmentOne = FragmentOne()

        // fragment에 데이터를 넣어주는 방법
        val bundle: Bundle = Bundle() // bundle을 만들어서
        bundle.putString("Hello", "hello") // 데이터를 넣어줌 (Key, Value 방식)
        fragmentOne.arguments = bundle // fragmentOne bundle을 세팅함

        // 소스코드로 Fragment 추가 하는 방법
        button.setOnClickListener {

            // 프라그먼트를 동적으로 작동하는 방법
            val fragmentManager: FragmentManager = supportFragmentManager

            // Transaction
            // 작업의 단위 -> 시작과 끝이 있다
            val fragmentTransaction = fragmentManager.beginTransaction()

            // fragment 를 붙이는 방법 replace/add
            fragmentTransaction.replace(R.id.container, fragmentOne)
            fragmentTransaction.commit()

            // 끝을 내는 방법
            // commit          -> 시간 될 때 해 (좀 더 안정적)
            // commitnow    -> 지금 당장해
        }

        button2.setOnClickListener {
            // fragment remove/detach 하는 방법
            val fragmentManager: FragmentManager = supportFragmentManager
            val fragmentTransaction = fragmentManager.beginTransaction()

            // fragmentTransaction.detach(fragmentOne) // -> 다시 못 붙임
            fragmentTransaction.remove(fragmentOne)  //  -> 다시 붙임
            fragmentTransaction.commit()

        }

    }


    override fun onStart() {
        super.onStart()
        Log.d("life_cycle","onStart")
    }

    /*
        - 앱으로 다시 돌아올때 무조건 호출 됨
        - Activity가 다시 호출될 때 하면 되는 작업들을 여기서 수행
    */
    override fun onResume() {
        super.onResume()
        Log.d("life_cycle","onResume")
    }

    /*
        onPause() onStop() 가 거진 동시에 일어나니 필요시 둘중에 한군대만 기능을 구현함
        - 우리가 만든 앱의 Activity(화면)이 일부분이 안보일때
    */
    override fun onPause() {
        super.onPause()
        Log.d("life_cycle","onPause")
    }

    /*
        - 우리가 만든 앱이 아예 안보일때 (홈 버튼을 눌러서 홈으로 돌아갈때 처럼)
    */
    override fun onStop() {
        super.onStop()
        Log.d("life_cycle","onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("life_cycle","onDestroy")
    }

}
