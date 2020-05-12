package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_intent.*

class Intent1 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_intent)

        /*
            동일 변수명, 함수명, 클래스명 한번에 바꾸는 방법
            변수명에 커서 대고 SHIFT + F6 > 변경후 ENTER
        */
        val ab = 10
        val b = ab+ 10
        val c = ab+10

        change_activity.setOnClickListener {
            // val intent  = Intent(this, Intent2::class.java) 이렇게 작성해도 됨
/*          val intent  = Intent(this@Intent1, Intent2::class.java)     // Intent(보낼 정보, 어디로 갈껀지(이동 대상))

            intent.putExtra("number1",1)
            intent.putExtra("number2",2)

            startActivity(intent)
*/

            val intent2  = Intent(this@Intent1, Intent2::class.java)     // Intent(보낼 정보, 어디로 갈껀지(이동 대상))

            // .apply{}는 intent2 에 관련한 작업은 여기에 모두 있다고 명시하는거
            intent2.apply{
                this.putExtra("number1",1)  // intent2.putExtra("number1",1) 와 같은거
                this.putExtra("number2",1)  // intent2.putExtra("number2",1) 와 같은거
                // startActivity(intent2)   얘는 전달만 하는 역할
                startActivityForResult(intent2,200)    // 얘는 전달을 하고 값까지 되돌려 받는 역할
            }

        }
    }

    /*
        setResult(Activity.RESULT_OK, resultIntent) 에서 보낸게
        override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) 에서
        Activity.RESULT_OK > resulutCode: Int
        resultIntent > data: Intent? 로 매칭됨
    */
    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {

        if(requestCode == 200){
            Log.d("requestCode", "" + requestCode)
            Log.d("resultCode", "" + resultCode)

            var result = data?.getIntExtra("result",0)
            Log.d("resultNumber", "" + result)
        }

        super.onActivityResult(requestCode, resultCode, data)
    }
}
