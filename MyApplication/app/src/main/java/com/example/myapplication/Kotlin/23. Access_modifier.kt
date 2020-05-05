package com.example.myapplication.Kotlin

// 23. 접근 제어자

fun main(array: Array<String>){

    val testAccess: TestAccess = TestAccess("아무개")

/*
   Private 키워드 때문에 외부에서 더 이상 사용할수 없다.
   testAccess.test()
   println(testAccess.name)

    testAccess.name = "아무개 투"   아무나 변수에 접근해서 변수의 값을 막 바꿀수있다
    println(testAccess.name)
*/

    val reward: Reward = Reward()   /* 아무나 변수에 접근해서 변수의 값을 막 바꿀수있다 */
    reward.rewardAmount = 2000

    val runningCar: RunningCar = RunningCar()
    runningCar.runFast()

}

class Reward(){
    var rewardAmount: Int = 1000
}

class TestAccess {
    /* var name: String = "홍길동" */
    private var name: String = "홍길동"    // 이 클래스 밖에서 인스턴스(객채화) 진행해서 접근해 값을 변경하는걸 막아버린다.

    constructor(name: String){
        this.name = name
    }

    fun changeName(newName: String){
        this.name = newName
    }

    private fun test(){     // 함수도 이 클래스 밖에서 인스턴스(객채화) 진행해서 접근하는걸 막아버린다.
        println("테스트")
    }
}


class RunningCar(){
    fun runFast(){
        run()
    }

    // 외부로 노출은 안하고 클래스 내부에서 기능을 동작하도록 만들때 사용 (private -> 내부와 외부를 단절 시키는 역할)
    private fun run(){

    }
}
