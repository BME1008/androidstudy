package com.example.myapplication.Kotlin

    // 16. Iterable
    /*
        Andrioid Studio 에디터안에 주석이나 변수명들 색상 바꾸는 방법
        File > Editor > Color Scheme > Language Defaults > 우측에서 색상 변경
    */
fun main(array: Array<String>){

    val a = mutableListOf<Int>(1, 2, 3, 4, 5, 6, 7, 8, 9)

    println("##########[반복하는 방법 (1)]##########")
    // 반복하는 방법 (1)
    for (item in a){    /* item in a 이면 a가 item에 들어감*/
      if(item == 5){
          println("item is Five")
      }else{
          println("item is not Five")
      }
    }

    println()
    println("##########[반복하는 방법 (2)]##########")
    // 반복하는 방법 (2)
    for((index, item) in a.withIndex()){    // item의 index와 value를 쌍으로 가져옴
        println("[일반 문법] index : " + index + " value : " + item)
        // 문자열 + Int(정수) = 문자열
        // 문자열 + 아무거나 = 문자열
    }
    println()
    // 반복하는 방법(2)를 lambda로 작성한는 방법
    a.forEachIndexed { index, item ->
        println("[lambda 문법] index : " + index + " value : " + item)
    }


    println()
    println("##########[반복하는 방법 (3)]##########")
    // 반복하는 방법 (3)
    a.forEach{
        print(it)
    }


    println('\n')
    println("##########[반복하는 방법 (4)]##########")
    // 반복하는 방법 (4)
    a.forEach{ item: Int ->     /* it 말고 내가 원한느 문자로 쓰고싶을때는 변수명 -> 이렇게 작성한다. 타입 :Int 는 생략 가능*/
        print(item)
    }


    println('\n')
    println("##########[반복하는 방법 (6)]##########")
    // 반복하는 방법 (6)
    println(a.size)
    for (i in 1 until a.size){  // i 는 index 가 들어가고 [ i in 1 은 1 부터 until a.size 까지 ]
        // ★ until은 마지막을 포함 하지 않음★ (a.size-1) >  0 부터 8 까지
         print(a.get(i))
    }
    println()
    for (i in 1..a.size-1){   // ★ .. 은 마지막을 포함 ★
        print(a.get(i))
    }


    println('\n')
    println("##########[반복하는 방법 (7)]##########")
    // 반복하는 방법 (7)
    for (i in 0 until a.size step (2)){     // step(2)는 index를 2씩 증가
        print(a.get(i))
    }


    println('\n')
    println("##########[반복하는 방법 (8)]##########")
    // 반복하는 방법 (8)
    for (i in a.size - 1 downTo (0)){   // downTo(0)는 a.size -1 부터 0 까지 반복
        print(a.get(i))
    }


    println('\n')
    println("##########[반복하는 방법 (9)]##########")
    // 반복하는 방법 (9)
    for (i in a.size - 1 downTo (0) step(2)){   // downTo(0)는 a.size -1 부터 0 까지 2씩 감소
        print(a.get(i))
    }


    println('\n')
    println("##########[반복하는 방법 (10)]##########")
    // 반복하는 방법 (10)
    for (i in 0..a.size){   // .. 은 마지막을 포함 ==>> 0 1 2 3 4 5 6 7 8 9
        print(i)
    }
    println()
    for (i in 0 until a.size){  // until 은 마지막을 미포함 ==>> 0 1 2 3 4 5 6 7 8
        print(i)
    }


    println('\n')
    println("##########[반복하는 방법 (11)]##########")
    // 반복하는 방법 (11)
    var b: Int = 0
    var c: Int =4

    while (b<c) {   // While은 처음에 조건이 만족하지 않으면 한번도 실행이 안 됨
        b++     // While문의 조건을 벗어나게해서 빠겨 나가게하는 역할
        print("b" + b + " / ")    // 조건이 True일 경우 계속 돌아감
    }

    println()

    var d: Int = 0
    var e: Int =4

    do {    // do While은 처음에 조건이 만족하던 안하던 최소 한번은 실행이 됨
        print("Hello" + " / ")
        d++     // While문의 조건을 벗어나게해서 빠겨 나가게하는 역할
    } while (d < e)


}