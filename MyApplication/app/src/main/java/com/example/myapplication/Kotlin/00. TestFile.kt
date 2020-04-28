package com.example.myapplication.Kotlin

fun main(args:Array<String>){
    test1()
    //test2()
}

fun test1(){

    // 강의를 보다가 MutableList 랑 mutableListOf 차이가  궁금해짐 차이가 뭘까?

    var list = MutableList(3,{0})
    var list2 = mutableListOf<Int>()
    var list3 = mutableListOf<Int>(97,98,99)

    // 둘다 Mutable Collection (변경 가능)로 추가, 수정이 가능함
    // MutableList 는 Size 지정과 초기화 필요, 초기화는 한가지 단일값으로 전체가 초기화(초기화 여러값을 못넣음)
    // mutableListOf 는 Size 지정과 초기화 필요 없음, 원하는 값들 넣어서 초기화 가능 (초기화 여러값을 넣음)


    //var list = MutableList(3,{0})
    list.add(4)  // 0,0,0,4
    list.add(0,11)  // 11,0,0,0,4
    list.add(55) // 11,0,0,0,4,55
    list.set(1,44)  // 11,44,0,0,4,55
    list[1] = 100  // 11,100,0,0,4,55

    println(list)

    //var list2 = mutableListOf<Int>()
    list2.add(4)  // 4
    list2.add(0,11) // 11,4
    list2.add(55)  //11,4,55
    list2.set(1,44)  //11,44,55
    list2[1] = 100  //11,100,55

    println(list2)

    //var list3 = mutableListOf<Int>(97,98,99)
    list3.add(4)  // 97,98,99,4
    list3.add(0,11)  // 11,97,98,99,4
    list3.add(55)  // 11,97,98,99,4,55
    list3.set(1,44)  // 11,44,98,99,4,55
    list3[1] = 100   // 11,100,98,99,4,55

    println(list3)

    /*
    * 테스트 결과
    * MutableList 와 mutableListOf 차이는 초기화시 SIZE 지정이 필요하냐 안필요하냐
    * 초기화 값이 단일 값 VALUE 초기화냐 다양한 값으로 VALUE 초기화냐 이정도로 보임
    */

}

fun test2(){

    val list1 = mutableListOf<Int>()
    val list2 = mutableListOf<Boolean>()

    for(i in 0..8) {
        list1.add(i+1)
    }


    println(list1)

    list1.forEach{item: Int ->

        if(item % 2 == 0){
            list2.add(true)
        }else{
            list2.add(false)
        }

    }

    println(list2)

}