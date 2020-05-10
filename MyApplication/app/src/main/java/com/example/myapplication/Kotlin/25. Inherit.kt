package com.example.myapplication.Kotlin

    // 두번 이상이 넘어가면 리팩토링을 해라
    // 리팩토링?
    //   ==>>> 깔끔하게 정리 정돈을 해라 (단!!! 기능에는 이상이 없어야함)

    // 25. 상속
    // 부모로부터 설명서를 물려 받는다.

fun main(args: Array<String>){

    val supercar100: SuperCar100 = SuperCar100()
    supercar100.drive()
    supercar100.stop()

    println(supercar100.drive())

    val bus100: Bus100 = Bus100()
    bus100.drive()
    bus100.stop()

}

/*
        class Car100(engine: String, body: String) 이라고 적지만 앞에
        private class Car100(engine: String, body: String) 이렇게 작성되어있는거다
        private > open class Car100(engine: String, body: String)로 바꿔주면 상속이 가능해짐
*/
open class Car100(){
   /* private 가 생략되어있다 */ open fun drive(): String{
       return "달린다."
        /*println("달린다.")*/
    }

    open fun stop(){
        println("멈춘다.")
    }
}

class SuperCar100(): Car100(){  /* 상속은 : Class명() 이런식으로 작성 */
    /*
        CTRL + O 눌러서 상속받은 메서드를 가져올수 있다. (직접 작성해도 문제 없음)
    */
    override fun drive(): String {  /* override > 덮어쓰다. */
        /*
            super.drive()
            CTRL + 좌클릭 하면 부모의 dieve로 감 즉!!! super.drive() 하면 부모의 dirve()를 사용하겠다는거
        */

        var run = super.drive()
        return "빨리 $run."

    }
}

class Bus100(): Car100(){   /* 상속은 : Class명() 이런식으로 작성 */

}