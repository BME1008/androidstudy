package com.example.myapplication.Kotlin


//java > com.example.myapplication > 우클릭 > NEW > Package > Kotlin 폴더 생성
//Kotlin 폴더 > 우클릭 > New Kotlin File/Class

//Kotlin 파일 실행 하는 방법은
//01.Variable.kt <=== 요 탭을 우클릭 > Run '_01_Variablekt' 클릭 (CTRL + Shift + F10)

// 01. Variable -> 변수
// 변수 선언하는 방법
// var , val 변수명 = 값
// Variable, Value

var num = 10 // 숫자
var hello = "hello" // 문자열
var pont = 3.4 // 소수점

val fix = 20


fun main(args:Array<String>){
// 프로그램이 구동되면 이 부분이 돌아가는거

    println(num);
    println(hello);
    println(pont);
    println(fix);

    num = 100
    hello = "good bye"
    pont = 10.4

    println();

    println(num);
    println(hello);
    println(pont);
    println(fix);

    // fix = 500 오류 발생 val은 값을 바꿀수가 없다. (불변)
}