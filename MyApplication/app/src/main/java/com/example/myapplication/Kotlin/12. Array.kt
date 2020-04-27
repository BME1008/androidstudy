package com.example.myapplication.Kotlin

// 12. 배열

// 배열이 필요한 이유
//  그룹(모음)이 필요할 때

fun main(array: Array<String>){

    println("배열을 생성하는 방법(1)")
    // 배열을 생성하는 방법(1)
    var number: Int = 10      /* Int 타입으로 선언 */
    var group1 = arrayOf<Int>(1, 2, 3, 4, 5)     /* Int 타입으로 배열 선언 (Int 데이터들만 들어갈수있다.*/

    println(group1 is Array)    // group1 이 array 이면 Ture 반환 아니면 Flase 반환
    println("==================================================")

    println("배열을 생성하는 방법(2)")
    // 배열을 생성하는 방법(2)
    var number1 = 10    // 변수 타입을 생략하면 값을 기준으로 변수의 타입이 결정됨
    var group2 =  arrayOf(1, 2, 3.5, "Hello")     // 배열의 타입을 생략하면 어무거나 다 넣을 수 있음
    println("==================================================")


    // 배열에서 Index 란?
    // var group = arrayOf(1, 2, 3, 4, 5) 라고하면
    // [1, 2, 3, 4, 5] 이렇게 들어있고
    // 1 에 접근하려면 index : 0, 2에 접근하려면 Index : 1 ~~~~ 이렇게 감 ( Index는 0 부터 시작)
    println("배열의 값을 꺼내는 방법(1)")
    // 배열의 값을 꺼내는 방법(1)
    val test1 = group1.get(0)
    val test2 = group1.get(3)
    println(test1)
    println(test2)
    println("==================================================")

    println("배열의 값을 꺼내는 방법(2)")
    // 배열의 값을 꺼내는 방법(2)
    val test3 = group1[0]
    println(test3)
    println("==================================================")

    println("배열의 값을 바꾸는 방법(1)")
    // 배열의 값을 바꾸는 방법(1)
    group1.set(0, 100)
    println(group1[0])
    println("==================================================")

    println("배열의 값을 바꾸는 방법(2)")
    // 배열의 값을 바꾸는 방법(2)
    group1[0] = 200
    println(group1[0])
    println("==================================================")

}