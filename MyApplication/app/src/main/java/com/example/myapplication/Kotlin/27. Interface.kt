package com.example.myapplication.Kotlin

fun main(args: Array<String>) {
    val student_: Student_ = Student_()

    student_.eat()
    student_.sleep()

}

interface Person_{  // 인터페이스는 () 생성자도 없다.
    fun eat()       // 인터페이스는 {} 가 없다.
    fun sleep()    // 인터페이스는 {}가 없다.
}


class Student_ : Person_{
    // Interface는 CTRL + I 로 메서드들 재정의 필요
    override fun eat() {

    }

    override fun sleep() {

    }
}

class SoccerPlay_: Person_{
    // Interface는 CTRL + I 로 메서드들 재정의 필요
    override fun eat() {

    }

    override fun sleep() {

    }
}