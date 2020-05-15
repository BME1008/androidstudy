package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.myapplication.Kotlin.Car

class NullSafety : AppCompatActivity() {

    lateinit var lateCar: Car    // 원시적인 타입은 lateinit 으로 만들수없다.

    //var lateCar: Car = Car(10)  lateinit을 사용했으니 여기서 바로 lateCar를 만들 필요는 없다.

    class Car(var number: Int){ }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_null_safety)

        lateCar = Car(10)

        Log.d("number","late number :: " + lateCar.number)

        val number: Int = 10
        val number1: Int? = null    // Null이 될수도있는 Int 타입


        // var number5: Int = number1!! + 10   // !! 는 number1이 절대 Null 아니니까 오류 보이지마!!!



        //  val number3 =  number? + number1 이런 사용은 불가능

        val number3 = number1?.plus(number) // plus라는 더하기 함수가 존재함

        //Log.d("number","number3 :: " + number3)

    /*
         삼항연산자 -> 엘비스 연산자
         Null safety를 위한 도구
    */
        val number4 = number1 ?: 10     // number1이 null 이면 10이 들어감

        //Log.d("number","number4 :: " + number4)

    }   // onCreate


    fun plus (a: Int, b: Int?): Int {   // return 은 null 이 못나가게 체크

        if(b != null) return a +b
        else return a
    } // plus

    fun plus2(a: Int, b: Int?): Int?{    // return 까지 Null이 나갈수 있는 방법
        return b?.plus(a)
    } // plus2

}   // NullSafety
