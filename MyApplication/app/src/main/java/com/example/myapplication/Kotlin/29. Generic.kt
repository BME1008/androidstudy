package com.example.myapplication.Kotlin

    // 29. Generic(제너릭)
    // 목적 : 다양한 타입의 객체들을 다루는 매서드(함수) 컬렉션
    //          클래스에서 컴파일 시에 타입을 체크해주는 기능
    //          ==>>> 요약하면 타입을 체크하는 기능
    //  제너릭은 만들기 어렵고 실제로 만들일 거의 없기 때문에 사용 하는 방법만 숙지

    // Array<String> 이 부분이 제너릭
    fun main(arrgs: Array<String>) {

        // 제너릭을 사용하지 않은 경우
        // 형 변환을 해줘야 한다
        val list1 = listOf(1, 2, 3, "가")
        val b: String = list1[2].toString()     // toString() 은 형변환(타입 변환)

        // 제너릭을 사용한느 경우  -> 타입이 안전 하다
        val list2 = listOf<String>("a", "b", "c")
        val c: String = list2[2]    // String 이라는 것을 보장 받는다 제너릭으로 <String>을 명시해서

        // 강한 타입을 체크 할수 있다
        var list3 = listOf(1, 2, 3, 4,"가","나",3.4)
        // var list4 = listOf<Int>(1,2,3,"가")  // 제너릭을 <Int>로 명시해서 "가" 문자는 못들어감 (강한 타입 체크)

    }