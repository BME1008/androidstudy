package com.example.myapplication.Kotlin

fun main(args:Array<String>){

    val a: Int? = null
    val b: Int = 10
    val c: Int = 100

    println("[1]")
    if (a == null){
        println("a is null")
    }else{
        println(" a is not null")
    }
    println("========================")


    println("[2]")
    if(b+c == 110){
        println("b plus c equal 110")
    }else{
        println("b plus c is not 110")
    }
    println("========================")


    println("[3]")
    // 엘비스 연산자 >> 형태는  ?:
    val number: Int? = null
    val number2: Int? = 100

    val number3 = number ?: 10  // number 의 값이 null 이면 10 넣어라 (number 는 현재  null)
    val number4 = number2 ?: 10  // number2 의 값이 null 이면 10 넣어라 (number2 는 현재 100)

    println(number3)
    println(number4)
    println("========================")

}