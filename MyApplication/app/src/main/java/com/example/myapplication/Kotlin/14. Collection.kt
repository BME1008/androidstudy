package com.example.myapplication.Kotlin

// 14. Collection
/*
*   list,   set,    map
*   값을 빼거나 바꾸거나 추가를 할 수 없다.
*/

fun main(args: Array<String>){

    println("######################################")
    println("Immutable Collections ( 변경 불가능 )")
    println("######################################")

    // Immutable Collections ( 변경 불가능 )
    //List (중복을 허용한다)
    val numberList = listOf<Int>(1, 2, 3, 3, 3)
    println("List : " + numberList)
    println(numberList.get(0))
    println("======================================")

    // Set -
    // 중복을 허용하지 않는다 (집합)
    // 순서가 없다 그로인해서 Index 값이 미존재
    val numberSet = setOf<Int>(1, 2, 3, 3, 3) /* 3을 세 번 넣어도 한번만 출력됨, 집합은 동일값을 허용하지 않음 */
    println("Set : " + numberSet)
    numberSet.forEach{
        println(it)
    }

    println("======================================")
    // Map - Key, Value 방식으로 한쌍으로 관리
    // Index 로 값에 접근하는게 아니라 key 로 값에 접근을 함
    val numberMap = mapOf<String, Int>("one" to 1, "two" to 2)
    println("Map : " + numberMap)
    println(numberMap.get("one"))
    println("======================================")
    println()
    println()

    println("######################################")
    println("Mutable Collection (변경 가능)")
    println("######################################")

    //Mutable Collection (변경 가능)
    var mNumberList = mutableListOf<Int>(1, 2, 3)
    println("mutableListOf 추가 전 : " + mNumberList)
    mNumberList.add(3, 4)
    println("mutableListOf 추가 후 : " + mNumberList)

    println("======================================")

    var mNumberSet = mutableSetOf<Int>(1, 2, 3, 4, 4, 4)
    mNumberSet.add(100)     // Set은  Index가 없어서 Index이 없이 값 추가

    var mNumberMap = mutableMapOf<String, Int>("one" to 1)
    println("mutableMapOf 추가 전 : " + mNumberMap)
    mNumberMap.put("two", 3)    /* put 할때는 to 안쓰고 , 씀 */
    println("mutableMapOf 추가 후 : " + mNumberMap)

}
