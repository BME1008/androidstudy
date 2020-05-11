package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_linstener.*  // layout.xml 파일을 import

class Linstener : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_linstener)

        /*
            다른 activity를 수행하고싶으면 AndroidManifest.xml 에서 <intent-filter></intent-filter>를 원하는 activity 블럭 안으로 이동
            <activity android:name=".Linstener">
                <intent-filter>
                <action android:name="android.intent.action.MAIN" />

                <category android:name="android.intent.category.LAUNCHER" />
                </intent-filter>
            </activity>
        */


        /*
            @뷰를 activity로 가져오는 방법

                1> 직접 찾아서 가져온다.
                val textView: TextView = findViewById(R.id.hello)    findViewById()를 쓰면 XML에 특정 id를 가진 내용을 가져옴
                textView. 으로 사용 (변수명으로 사용)

                2> xml을 import해서 가져온다.
                hello.  으로 사용함 (xml의 android:id="@+id/hello" 값으로 사용)
        */



        // 1. 람다표현식  ※ 3번이 귀찮아서 2번으로 진화해 그것도 귀찮아 최종적으로 1번으로 진화
        hello.setOnClickListener {
            //Log 에 빨간줄 그어지면 import가 안되어서 그런거임 Log에 커서 놓고 ALT + ENTER 로 import
            var text: String = hello.text.toString()
            Log.d("Click", text)
        }

        /* 2. 익명 함수 방식
        hello.setOnClickListener(object : View.OnClickListener{
            override fun onClick(v: View?) {
                Log.d("Click", "Click!!")
            }
        })*/

        /* 3.그냥 세번째 방식 -> 이름이 필요한 경우(click)
        val click = object: View.OnClickListener{
            override fun onClick(v: View?) {
            }
        }
        hello.setOnClickListener(click)*/

    }
}
