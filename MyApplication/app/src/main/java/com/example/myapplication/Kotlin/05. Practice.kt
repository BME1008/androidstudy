package com.example.myapplication.Kotlin

fun plusThree(first: Int, second: Int, thrid: Int): Int{
    /*
        val result = first + second + thrid
        return result
    */
    // 위에 두줄을 한줄로 줄이면 아래 처럼
    return first + second + thrid
}

// 함수 간단하게 쓰기
fun minusThree(first: Int, second: Int, thrid: Int) = first - second - thrid

// 함수 인자에 기본값 주기
fun mutipleThree(first: Int=1, second: Int=1, thrid: Int=1): Int {
    return first * second * thrid
}

// 내부 함수
// 함수안에 함수가 또 있음
fun showMyPlus(first: Int, second: Int): Int{
    println("showMyPlus : " + first)
    println("showMyPlus : " + second)

    fun plus(first: Int, second: Int): Int{
        return first + second
    }
    return plus(first, second)
}

fun main(array: Array<String>){
    val result = plusThree(1,2,3)
    println("1 : " + result)

    val result2 = minusThree(10,1,2)
    println("2 : " + result2)

    val result3 = mutipleThree(2,2,2)
    println("3 : " + result3)

    val result4 = mutipleThree()
    println("4 : " + result4)

    val result5 = showMyPlus(4,5)
    println("5 : " + result5)
}