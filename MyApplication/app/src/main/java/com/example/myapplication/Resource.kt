package com.example.myapplication

import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_resource.*

class Resource : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_resource)

        // 1
        val ment = resources.getString(R.string.hello_kor)
        Log.d("ment", "ment :: " + ment)

        //2
        val ment2 = getString(R.string.hello_eng)
        Log.d("ment", "ment :: " + ment2)

        // SDK 버전에 따른 분기 처리
        val color = if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {   // 앱이 설치된 스마트폰 버전이 23보다 높으면

            button001.setBackgroundColor(getColor(R.color.colorSkyBlue))
            //getColor(R.color.colorSkyBlue)  // API 23 이상 부터 사용이 가능
        } else {    // 앱이 설치된 스마트폰 버전이 23보다 낮으면
            // resources.getColor(R.color.colorYellow)
            button001.setBackgroundColor(resources.getColor(R.color.colorYellow))

        }
        Log.d("color", "color :: " + color)



    }
}
