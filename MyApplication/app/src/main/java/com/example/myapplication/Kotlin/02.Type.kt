package com.example.myapplication.Kotlin

// 02. 자료형
// 정수형 -> Long > Int > Short > Byte   (왼쪽으로 갈수록 표현 범위가 커짐)
// 실수형 -> Double > Float
// 문자 -> Char (1글자)
// 문자열 -> String (여러자)
// 논리형(참 True, 거짓 False) -> Boolean

var number = 10

// 변수 선언하는 방법 (2)
// var, val 변수 : 자료형 = 값
var number1: Int = 20
var hello1: String = "Hello"
var point1: Double = 3.4

// Variable or Value 선택은?
//  1. 변하지 않은 값이라면 Value
//  2. 값이 변할지 안변할지 몰라 Value로 작성을 했다가 나중에 바꿀일이 생기면 Variable로 바꾸는걸 추천

fun main(args:Array<String>){

    number = 20
    //number = 20.5  오류남 var 의 경우 처음 선언됐을때 숫자면 숫자만 들어감, 소수 문자 같은 다른 자료형은 못들어감

    println(number1)
    println(hello1)
    println(point1)

}