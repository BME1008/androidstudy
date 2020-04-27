package com.example.myapplication.Kotlin

// 04. Function
// 함수란?
// 어떤 input을 넣어주면 어떤 output 나오는 것

// 함수를 선언하는 방법
// fun 함수명 (변수명: 타입, 변수명: 타입, 변수명: 타입..........) : 반환형 {
//     함수 내용
//     return 반환값
// }
fun plus(first: Int, second: Int): Int {
    println(first)
    println(second)

    val result: Int = first + second
    println(result)

    return result
}

// 디폴트 값을 갖는 함수 만들기
fun plusFive(first: Int, second: Int = 5): Int {
    val result: Int = first + second

    return result
}

// 반환값이 없는 함수 만들기
// 반환형 Unit은 아무것도 리턴 하지 않겠다는 의미 JAVA로 따리면 void와 비슷
fun printPlus(firt: Int, second: Int): Unit {
    val result: Int = firt + second
    println(result)
}

fun printPlus2(first: Int, second: Int) /*반환형 생략 */ {
    val result: Int = first + second
    println(result)
}

// 간단하게 함수를 선언하는 방법 (축약적으로 사용)
fun plusShort(first: Int, sencond: Int) = first + sencond

// 가변인자를 갖는 함수 선언 방법 (가끔 사용됨)
// vararg 자료형을 사용하면 1 ~ n 개까지 다양하게 받을수있음
fun plusMany(vararg numbers: Int){
    for(number in numbers ){
        println(number)
    }
}

// 한줄 주석 처리하는법 CTRL + /  단축키
fun main(array: Array<String>) /* 이곳에 반환형 생략 가능 */ {
    // 함수를 호출하는 방법
    println("===============함수를 호출===================")
    var total: Int = plus(5, 10)  // 함수의 ()에  커서 대고 CTRL + P 하면 어떤 형이 들어가는지 보여줌
    println(total)
    println("===============인수를 명시적으로 함수 호출===================")
    // 인수를 명시적으로 전달하는 방법
    var total2: Int = plus(first = 20, second = 30)
    println(total2)

    println("================= plusFive 함수 호출 1 ===============")
    // 디폴트 값을 갖는 함수 호출하기
    val result4 = plusFive(10, 20)
    println(result4)

    println("================= plusFive 함수 호출 2 ===============")
    // 디폴트 값을 갖는 함수 호출하기
    val result5 = plusFive(10)
    println(result5)

    println("================= printPlus 함수 호출 ===============")
    // 반환값이 없는 함수 만들기
    printPlus(10, 20)

    println("================= printPlus2 함수 호출 ===============")
    // 반환값이 없는 함수 만들기
    printPlus(50, 50)

    println("================= plusShort 함수 호출 ===============")
    // 간단하게 함수 만들기
    val result6 = plusShort(100, 100)
    println(result6)

    println("================= plusMany 함수 호출 ===============")
    // 가변인자를 갖는 함수 선언 방법
    plusMany(1,2,3)
    plusMany(100)
    /*
            File > Settings > Keymap > Reformat Code (우측 상단에 돋보기에서 검색) 우클릭으로 키 세팅가능
            기본은 CTRL + ALT + L
    */
}