package com.example.myapplication.Kotlin

// 11 제어흐름 실습

fun main(array: Array<String>){

    // When - Int
    println("[When - Int]")
    val value: Int? = null

    when(value) {
        null -> println("value is null")
        else -> println("value is not null")
    }
    println("==============================")

    // When - Boolean
    // When 에서 Boolean 값을 대응시 true, false, null 까지 경우의 수를 만들어야함
    // Null 조건은 없어도 오류는 안 남
    println("[When - Boolean]")
    val value2: Boolean? = null

    when(value2){
        true -> {
            println("")
        }
        false -> {
            println("")
        }
        null -> {
            println("")
        }
    }
    println("==============================")

    println("[값 리턴하는 When - Boolean]")
    // 값을 리던하는 When  구문의 경우 반듯이 null 체크 까지해서 값을 리턴해야함
    val value3 = when(value2){
        true -> 1  // value2 가 true 이냐?
        false -> 3 // value2 가 false 이냐?
        null -> 4  // value2 가 null 이냐?
    }

    println(value3)
    println("==============================")


    println("[When - is]")
    // When 의 다양한 조건식 (1)
    // is 는 Type을 물을수도있다. 이게 Int 형이냐고 묻는거다
    val value4: Int = 10

    when (value4) {
        is Int -> {    // value4 가 Int 형이냐?
            println("Value4 is int")
        }
        else -> {   // value4 가 Int 형이 아니냐?
            println("Value4 is not int")
        }
    }
    println("==============================")

    println("[When - in]")
    // in 범위1 .. 범위2 value5 가 범위1..범위2 사이에 존재 하는가 묻는거다 (자세한 설명은 곧 다른 강의에서)
    // When 의 다양한 조건식 (2)
    val value5: Int = 87

    when (value5) {
        in 60..70 ->{
            println("value is in 60~70")
        }
        in 70..80->{
            println("value is in 70~80")
        }
        in 80..90->{
            println("value is in 80~90")
        }
    }
    println("==============================")


}