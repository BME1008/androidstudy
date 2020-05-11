package com.example.myapplication.Kotlin_Test

fun main(args: Array<String>){

    var result = a001(200,100)

    println("함수 호출 결과는? : $result")

    val result2 = if(result == 111111) 10 else 100

    when(result2){
        in 90..100 ->{
            println("크다")
        }
        else->{
            println("별로 안크다")
        }
    }
    b001(10)

}

fun a001(a01:Int, a02:Int): Int {

    var result: Int = 0
    var result2: Int =0

    fun check2(a03: Int): Int{

        if(a03 > 0){
            result2 = 999999
        }else if(a03 < 0){
            result2 = 111111
        }else{
            result2 = 0
        }

        return result2
    }

    fun check1(a01: Int, a02:Int): Int{

        if(a01 > a02){
             result = a01 + a02 + 1000
        }else if(a02  > a01){
             result = (a02 - a01) - 1000
        }
        return check2(result)
    }

    return check1(a01, a02)

    /*
            함수 안에 함수가 위치할 경우 호출을 당하는 함수가 호출을 시도하는 함수보다 아래 있으면 호출이 안됨
            왜안되죠????

            fun check2(){
            }
    */

}
/*#################################################################
##################################################################
#################################################################*/

fun b001(b01:Int){

    for(item in 0..b01){ print(item)}
    println()
    for(item in 0 until b01){print(item)}



}