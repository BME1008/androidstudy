package com.example.myapplication.Kotlin

fun main(array: Array<String>){

    // 산술 연산자
    var a = 10 + 1
    var b = 10 - 1
    var c = 1 * 9
    var d = 20 / 3
    var e = 20 % 3

    println("[산술 연산자]")
    println(a)
    println(b)
    println(c)
    println(d)  // 몫 6이 출력
    println(e)  // 6으로 나누면 20 - (6*3) = 2 나머지가 2 남으니까 2가 출력
    println("==================")

    // 대입 연산자
    var f = 5

    // 복한 대입 연산자
    a += 10  // 위에 산술 연산자 에서 var a = 10 + 1 수행해 a = 11인데 거기사 다시 10을 더하니까 21 출력
    // a = a + 10 이랑 같은거
    b -= 10
    c *= 3
    d /= 4
    e %=2

    println("[복한 대입 연산자]")
    println(a)
    println(b)
    println(c)
    println(d)  // 몫 6이 출력
    println(e)  // 6으로 나누면 20 - (6*3) = 2 나머지가 2 남으니까 2가 출력
    println("==================")

    // 증감 연산자
    a++
    b--
    println("[증감 연산자]")
    println(a)
    println(b)
    println("==================")

    // 비교 연산자 ( a 22 , b -2 인 상황)
    var g = a > b
    var h = a == b
    // var i = !a  ! 는 boolean True, False 일 경우만 반대로 출력됨 숫자는 반대로 출력 불가
    var i = !h // Ture 이니까 Flase가 나옴
    var l = i != h  // i 랑 h 랑 같지 않은가? 같지 않으니 Ture 반환

    println("[비교 연산자]")
    println(g)
    println(h)
    println(i)
    println(l)
    println("==================")

    // 논리 연산자 (현재 h = false , i = ture)
    var j = h && i  // && 둘다 Ture 이면 Ture
    var k = h || i   // || 둘중 하나만 Ture 이면 Ture

    println("[논리 연산자]")
    println(j)
    println(k)
    println("==================")
}