package com.example.myapplication.Kotlin

import android.speech.tts.TextToSpeech

// 18. Class

    // OOP -> Object Oriented Programing (객체지향 프로그래밍)
    /*
        객체란 뭘까?
            이름이 있는 모든 것

        절차지향 프로그래밍
            코드를 위에서 부터 아래로 실행을 하면 문제가 해결됨

        객체지향 프로그래밍 문제 해결 방법
            객체를 만들어서 객체에게 일을 시켜서 문제를 해결
            선수, 심판, 경기장, 관중 -> 축구 게임

        객체를 만드는 방법
            설명서가 있어야 함
    */

    fun main(array: Array<String>){
        // 클래스(설명서)를 통해서 실체를 만드는 방법
        // -> 인스턴스화 -> 인스턴스(객체)
        Car("v8 engine","big")


        // Car()에서 반환되는 값을 변수화
        val bigCar = Car("v8 engine","big")


        // 우리가 만든 클래스(설명서)는 자료형이 된다.
        val bigCar1: Car = Car("v8 engine", "big")
        val superCar: SuperCar = SuperCar("good engine", "big","white")
        // ==>>> 이렇게 호출하면 constructor(engine: String, body: String, door: String)  여기로 들어감


        // 인스턴스가 가지고있는 기능을 사용한느 방법
        val runable: RunableCar = RunableCar("simple engine", "big body")
        runable.ride()
        runable.navi("My Home")
        runable.drive()


        // 인스턴스의 맴버 변수에 접근 하는 방법
        var runableCar2: RunableCar2 = RunableCar2("Nice Engine", "Long Body")

        println("RunableCar2에 접근해서 engine 출력 하면 : ${runableCar2.engine}")
        println("RunableCar2에 접근해서 body 출력 하면 : ${runableCar2.body}")

    }

    // 클래스(설명서) 만드는 방법(1)
    class Car constructor(var engine: String, var body: String){    // class Car (var engine: String, var body: String){    같은거다

    }

    // 클래스(설명서) 만드는 방법(2)
    class SuperCar{
        var engine: String = "" // 변수 초기화
        var body: String = ""   // 변수 초기화
        var door: String = ""   // 변수 초기화

        // "constructor(){}는 조립방법" 이라고 생각하자
        constructor(engine: String, body: String, door: String){
            // this를 CTRL + 마우스 클릭시 class SuperCar{} 로 감, this는 SuperCar{} Class를 지칭하는거
            this.engine = engine
            this.body = body
            this.door = door
        }
    }


    // 클래스(설명서) 만드는 방법(3) ==>> 1번 방법의 확장판
    // engine과 body는 필수이지만 door는 필수가 아닐 경우
    class Car1 constructor(engine: String, body: String){   // class Car1 (engine: String, body: String){   같은거다
        var door: String = ""   // 변수 초기화

        constructor(engine: String, body: String, door:String): this(engine, body){
            this.door = door
        }
    }


    // 클래스(설명서) 만드는 방법(4) ==>> 2번 방법의 확장판
    class Car2 {
        var engine: String = ""
        var body: String = ""
        var door: String = ""

        constructor(engine:String, body: String){
            this.engine = engine
            this.body = body
        }

        constructor(engine: String, body: String, door: String){
            this.engine = engine
            this.body = body
            this.door = door
        }
    }


    class RunableCar(engine: String, body: String){

        fun ride(){
            println("탑승 하였습니다.")
        }

        fun drive(){
            println("달립니다!")
        }

        fun navi(destination: String){
            println("$destination 으로 목적지가 설정되었습니다.")
        }

    }


    class RunableCar2{
        var engine: String =""
        var body: String = ""

        constructor(engine: String, body: String){
            this.engine = engine
            this.body = body
        }

        init{
            // 인스턴스화 될때 이부분이 제일 먼저 출력됨
        }

        fun ride(){
            println("탑승 하였습니다.")
        }

        fun drive(){
            println("달립니다!")
        }

        fun navi(destination: String){
            println("$destination 으로 목적지가 설정되었습니다.")
        }

    }




