package com.example.myapplication.Kotlin


var a = 1 + 2 + 3 + 4 + 5 // 연산의 결과도 변수에 넣어 줄 수 있다.

var b = "1"
var c = b.toInt() //  변수 b의 값을 Int로 바꿔서 변수 c에 넣어라
var d = b.toFloat() //  변수 b의 값을 float로 바꿔서 변수 d에 넣어라

var e = "John"
var f = "My name is $e Nice to meet you"  // $e -> 변수 e의 값을 붙여라


// 두루마리 휴지를 다 쓰고 휴지심만 남으면 이것은 0
// 두루마리 휴지를 다 쓰고 휴지심까지 없으면 존재 하지 않는거
// Null
// 존재 하지 않는다

// var abc : Int = null
var abc1 : Int? = null  // ? 를 붙이면 이것은 Null 을 가질수 있는 변수
var abc2 : Double? = null  // ? 를 붙이면 이것은 Null 을 가질수 있는 변수

var g = a  + 3;

fun main(array: Array<String>){
    println(a)
    println(b)
    println(c)
    println(d)
    println(f)
    println(abc1)
    println(g)
}

