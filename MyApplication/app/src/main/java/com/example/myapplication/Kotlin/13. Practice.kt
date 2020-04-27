package com.example.myapplication.Kotlin

fun main(array: Array<String>){
    val array = arrayOf<Int>(1,2,3)

    println("[get, set]")
    // get 꺼낼때, set 넣을때
    val number = array.get(0)
    println("get() : " + number)

    array.set(0, 100)
    val nember2 = array.get(0)
    println("set() :" + nember2)
    println("==================================================")


    // Array 의 Bounds는 처음 만들때 결정 된다. (※ 만들고 나면 Size 변경 안됨)
    // val array = arrayOf<Int>(1,2,3) 이때 결정됨 이거는 3개 인거다.


    // Array를 만드는 방법 (3)
    val a1 = intArrayOf(1, 2, 3)
    //var a2 = charArrayOf("b")     오류남!!! String이 들어왔다고 Char를 넣으라고 char는 "" 가 아니라 '' 이걸로 묶는다
    val a2 = charArrayOf('b')
    val a3 = doubleArrayOf(1.2, 100.345)
    val a4 = booleanArrayOf(true, false, true)


    // Array를 만드는 방법 (4) [몰라도 됨 있다고만 알아둬라]
    var a5 = Array(10,{0}) /* { } lambda라고 부른다 이렇게 쓰면 10개 모두가 0 으로 채워짐 */
    var a6 = Array(5, {1; 2; 3; 4; 5})

}