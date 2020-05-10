package com.example.myapplication.Kotlin

    // 28. 인터페이스
    //  @ 인터페이스도 구현이 있는 함수를 만들수 있다.
    //  @ 인터페이스에 구현이 있는 함수는 그 인터페이스를 구현 하는 클래스에서 그 함수를 구현할 필요가 없다.
    //  @ 인터페이스에 구현이 없는 함수는 그 인터페이스를 구현 하는 클래스에서 그 함수를 반듯이 구현해야 한다.

fun main(args: Array<String>) {

    val student = Student__();
    student.sleep()
    student.study()

}

interface Person__{  // 인터페이스는 () 생성자도 없다.
    /*
        fun eat()       // 인터페이스는 {} 가 없다.
        fun sleep()    // 인터페이스는 {}가 없다.
    */

    fun eat(){      // 인터페이스에서 {}에 기능을 구현도 가능
        println("먹는다")
    }

    fun sleep(){    // 인터페이스에서 {}에 기능을 구현도 가능
        println("잔다")
    }

    abstract fun study()    // abstract 가 붙으면 반드시 인터페이스 하는곳에서 기능 구현 필요

    /*
        abstract fun sleep(){   기능이 작성된 함수도 abstract 가 붙으면 인터페이스 하는곳에서 기능 구현 필요
            println("잔다")
        }
    */
}

class Student__ : Person__{
    // fun eat() 로 구현했으면 반드시 인터페이스한 클래스에서 기능 구현 해야함
    // fun ear(){ } 로 기능까지 구현했으면 인터페이스한 클래스에서 별도로 기능 구현 필요없음

    override fun study() {
        var aaa = 222
        println("공부한다.")
    }
}

class SoccerPlay__: Person__{
    override fun study() {

    }
}
