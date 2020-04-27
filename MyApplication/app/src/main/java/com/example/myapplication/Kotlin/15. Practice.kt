package com.example.myapplication.Kotlin

fun main(array: Array<String>){

    println("#####################################")
    println("############## mutableListOf ##############")
    println("#####################################")

    // add는 index 와 value 로 줄수있고 아니면 그냥 value만 명시 가능
    val a = mutableListOf<Int>(1, 2, 3)
    a.add(4)    // Index 미지정시 맨 끝으로 추가
    println("add 전 : " + a)

    a.add(0, 100)   // add는 Index 0에 100이 들어가고 기존꺼는 하나씩 밀려남
    println("add 후 : " + a)

    a.set(0,200)    // set은 기존에 Index 0에 100을 200으로 변경
    println("set 후 : " + a)

    a.removeAt(1)
    println("removeAt 후 : " + a)
    println("")

    println("#####################################")
    println("############## mutableSetOf ##############")
    println("#####################################")

    val b = mutableSetOf<Int>(1, 2, 3, 4)
    println("add 전 : " + a)
    b.add(2)    /* 변화없음 set은 집합의 개념이라 중복값을 허용하지 않음, set은 순서가 없으니 Index 없음 */
    println("add 후 : " + b)
    b.remove(2)
    println("remove 후 : " + b)  /* 일치하는 값을 지워줌 */
    println("")

    println("######################################")
    println("############## mutableMapOf  ##############")
    println("######################################")

    val c = mutableMapOf<String, Int>("one" to 1)
    println("put 전 : " + c)
    c.put("two", 2) /* put 으로 넣을때 to 를 배고 , 로 Key Value 구분 */
    println("put 후 : " + c)
    c.replace("two", 3)     // API Level 24 부터 사용가능한 메서드라서 경고 출력
    println("replace 후 : " + c)
    println("Key 모아보기 : " + c.keys)
    println("Values 모아보기 : " + c.values)
    c.clear()   // c에 있는걸 모두 지워버림
    println("clear 후 : " + c)






}
