package com.example.myapplication.Kotlin

    /*
        변수의 접근 범위
         1. 전역 변수
         2. 지역 변수
     */

/*
    전역 변수 ->>  number100 은 main() 함수에서도 Test클래스의 testFun() 함수에서도 모두 접근이 가능
*/
var number100: Int = 10

fun main(args: Array<String>){

    println(number100)

    // Test 클래스의 name 에 접근하는 방법
    val test = Test("홍길동")
    test.testFun()
    test.name

    println(number100)

}

// name은 중가로 안에서 어디서든지 접근이 가능
class Test(var name: String){

    fun testFun(){

       var birth: String = "2000.3.1"   // birth는 함수 안에서만 접근이 가능

        name = "홍길동"    // 클래스안에 함수에서는 맴버변수인 name 접근이 가능함
        number100 = 100

        /* gender  변수 사용 불가 testFun2 함수에서 선언된거라서 */
        fun testFun2(){
            var gender: String = "male"
        }
    }

    fun testFun3(){
        name    // name은 클래스 안에서 어디서든지 사용이 가능
        /* birth    birth는 다른 함수 안에서 선언된거라 선언된 함수 안에서만 사용이 가능 */
    }

}