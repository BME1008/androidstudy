package com.example.myapplication.Kotlin

// 08. 제어 흐름
//  if, else

fun main(arg:Array<String>){
    val a: Int = 5
    val b: Int = 10

    // Main 이 실행되면 0 수행 > (a>b) a가 b보다 크면 1 수행 후 3 수행 후 종료
    // (a>b) a가 b보다 작으면 2 수행 후 3 수행 후 종료

    // if else 사용 하는 방법 (1)
    println("[if else 사용 하는 방법 (1)]")
    println("[0번]")
    if(a>b){
        println("[1번] a 가 b 보다 크다")
    }else{
        println("[2번]  a 가 b 보다 작다")
    }
    println("[3번]")
    println("================")


    // if else 사용 하는 방법 (2)
    println("[if else 사용 하는 방법 (2)]")
    if(a<b){
        println("a 가 b 보다 크다1")
    } // else 부분은 생략 가능

    if(a<b) println("a 가 b 보다 크다2")    // 이렇게 사용도 가능
    println("================")



    // if/else/else if 사용 하는 방법 (2)
    println("[f/else/else if 사용 하는 방법 (2)]")
    if(a>b){
        println("[1번] a 가 b 보다 크다")
    }else if (a<b){
        println("[2번] a 가 b 보다 크다")
    }else{ // if , else if 문에서도 else는 생략 가능
        println("[3번] a 와 b는 같다 ")
    }
    println("================")


    // 값을 리턴하는 if 사용방법
    println("[값을 리턴하는 if 사용방법]")
    val max = if(a>b){  // a=5, b=10
        a
    }else{
        b
    }

    val max1 = if(a>b) a else b  // 이렇게 줄여서 적을수 있음
    println(max)
    println(max1)
    println("================")
}