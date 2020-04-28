package com.example.myapplication.Kotlin


fun main(args: Array<String>){
    q1()
    println(q2(70))
    println(q3(44))
    q4()
}

fun q1(){

// 1번 문제
// List를 두개 만든다.
// 첫번째 List에는 0 부터 9 까지 값을 넣는다. (반복문)
// 두번째 List에서 첫번째 List으 값을 하나씩 확인후
// 짝수면 True 홀수면 False를 넣어 준다.

    println("문제 [01]")
    var list1 = MutableList(9, {0})

    for(i in 0..8){
        list1[i] = i+1
    }

    var list2 = MutableList(9,{"ture"})

    list1.forEachIndexed{index, value->
        if(value % 2 ==0){
            list2[index]="true"
        }else{
            list2[index]="false"
        }
    }

    println(list1)
    println(list2)

}

fun q2(temp: Int): String{

    // 2번 문제
    // 학점을 구하자
    // 80 ~ 90 > A
    // 70 ~ 79 > B
    // 60 ~ 69 > C
    // 나머지 F

    println("문제 [02]")

/*    var result: String = when(temp){
        in 80..90 -> "A"
        in 70..79 -> "B"
        in 60..69 -> "C"
        else -> "F"
    }

    return result*/

   when(temp) {
        in 80..90 -> return "A"
        in 70..79 -> return "B"
        in 60..69 -> return "C"
        else -> return "F"
   }

}

fun q3(number: Int): Int{

    // 3번 문제
    // 전달 받은 숫자의 각 자리 수의 합을 구하자
    // 조건 : 전달 받은 숫자는 무조건 두자리 숫자이다.

    println("문제 [03]")

    val a: Int = number / 10
    val b: Int = number % 10

    return a + b

}


fun q4(){

// 4번 문제
// 구구단을 출력하자

    println("문제 [04]")

    for(i in 1..9){
        for(j in 1..9){
           print(" $i x $j = ${i*j}" )
        }
        println()
    }


}



