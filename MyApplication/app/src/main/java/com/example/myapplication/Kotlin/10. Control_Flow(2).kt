package com.example.myapplication.Kotlin

// 10 제어흐름
// When

fun main(args: Array<String>){

    val value: Int = 1

    println("when[1]")
    when(value){
        1 ->{  // value가 1일때
            println("Value is 1")
        }
        2 ->{  // value가 2일때
            println("Value is 2")
        }
        3->{    // value가 3일때
            println("Value is 3")
        }
        else->{     // 그밖에
            println("I do not know value")
        }
    }
    println("======================")


    println("when[2]")
    when(value){
        1 -> println("Value is 1")
        2 -> println("Value is 2")
        3 -> println("Value is 3")
        else ->  println("I do not know value")
    }
    println("======================")


    println("when 에서 if 문[1]")
    if (value == 1){
        println("Value is 1")
    }else if(value ==2){
        println("Value is 2")
    }else if(value ==3){
        println("Value is 3")
    }else{
        println("I do not know value")
    }
    println("======================")


    println("when 에서 if 문[2]")
    if (value == 1) println("Value is 1")
    else if(value ==2) println("Value is 2")
    else if(value ==3) println("Value is 3")
    else println("I do not know value")
    println("======================")


    println("값을 리턴하는 when 사용방법")
    var value2 = when(value){
        1 -> 10
        2 -> 20
        3 -> 30
        else -> 100
    }
    println(value2)
    println("======================")
}
