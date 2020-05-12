package com.example.myapplication

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_intent2.*

class Intent2 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_intent2)

        /* get자료형Extra ex)getIntExtra, getStringExtra 처럼 사용, defaultValue 필수 null일 경우 대응   */
        val number1 = intent.getIntExtra("number1",0)
        val number2 = intent.getIntExtra("numbe2r",0)

        Log.d("number1",""+ number1)
        Log.d("number2",""+ number2)

        result.setOnClickListener{
            val number1 = intent.getIntExtra("number1",0)
            val number2 = intent.getIntExtra("number2",0)

            Log.d("number1",""+ number1)
            Log.d("number2",""+ number2)

            val result = number1 + number2

            /*
                Intent 를 다시 되돌려 보내는 방법
            */
            val resultIntent = Intent()
            resultIntent.apply{
                resultIntent.putExtra("result", result)
            }

            setResult(Activity.RESULT_OK, resultIntent)   // setResult(-1) 로 작성해도 같음
            finish()    // Activity 종료

        /*
            Activity는 Stack으로 관리 됨 = 불러오는 순서대로 쌓임
            Intent1 Activity에 Intent2 Activity 를 호출 화면 Activity1 > Activity2로 전환되고 Intent1 Activity 위에 Intent2 Activity 가 쌓이게됨

            Intent2 Activity (2층)
            Intent1 Activity (1층)
            ▼  Intent2 Activity를 finish() 종료하면
            Intent1 Activity (1층) 만 남게됨
        */
        }

    }
}
