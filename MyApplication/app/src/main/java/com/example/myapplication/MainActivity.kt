package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity     // 기본 import
import android.os.Bundle    // 기본 import
import android.util.Log

class MainActivity : AppCompatActivity() {

    /* CTRL + O 로 오버라이드 함수 추가 가능 */

    /*
        - 비정상적으로 Activity가 종료되어서 다시 실행하지 않는 이상 최초로 한 번 실행되면 이곳으로 돌아오지는 않음
        - Activity를 만들때 단 한번만 하면 되는 작업들을 여기서 수행
    */
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.practice_13)    // 화면을 그려주는 역할

        Log.d("life_cycle","onCreate")
        /* Kotlin 할때 println() 처럼 찍어볼수있는 기능임, 출력은 6: Logcat 에서 확인 */

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
