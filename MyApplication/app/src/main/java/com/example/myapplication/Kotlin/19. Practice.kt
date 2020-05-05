package com.example.myapplication.Kotlin

/*
*  사직 연산 클래스 만들어 보기
*/

fun main(array: Array<String>){

    /* 기본적인 클래스 호출로 구현해보기 */
    println("[기본 클래스로 구현]")
    var calculator1 = Calculator1()

    println("plus ${calculator1.plus(4,5)}")
    println("minus ${calculator1.minus(4,5)}")
    println("mutiply ${calculator1.mutiply(4,5)}")
    println("divide ${calculator1.divide(4,5)}")


    /* vararg(1 ~ n 개까지 다양하게 받을수있음) 으로 구현해 보기 */
    println("\n[vararg로 클래스 구현]")
    var calculator2 = Calculator2()

    println("plus ${calculator2.plus(1,3,4)}")
    println("minus ${calculator2.minus(10,1,2,3)}")
    println("mutiply ${calculator2.mutiply(1,3,4)}")
    println("divide ${calculator2.divide(10,2,3)}")


    /* initialValue 로 구현해보기 */
    println("\n[initialValue로 클래스 구현]")

    val calculator3 = Calculator3(3)

    calculator3.plus(5).minus(5)
    println(calculator3.result2)

 /*
    ※ 체이닝
    calculator3.plus(5).minus(5) 을 풀어서 써보면
    ==>>  calculator3 ===> Calculator(3)
                calculator3.plus(number:5) ===> Calculator(8)
                calculator3.plus(number:5).minus(number:5) ===> Calculator(8).minus(5)

*/

    /* mutableListOf 로 구현해보기 */
    println("\n[mutableListOf로 클래스 구현]")
    var calculator000 = Calculator000()

    var numers = mutableListOf<Int>(1,2,3,4)
    calculator000.plus(numers)

}


/*
    1) 사칙 연산을 수행할 수 있는 클래스
*/
class Calculator1(){

    fun plus(a:Int, b:Int):Int  {
        return a + b
    }

    fun minus(a:Int, b:Int):Int{
        return a - b
    }

    fun mutiply(a:Int, b:Int):Int{
        return a * b
    }

    fun divide(a:Int, b:Int):Int{
        return a / b
    }

}

class Calculator2(){
    // vararg 자료형을 사용하면 1 ~ n 개까지 다양하게 받을수있음
    fun plus(vararg numbers: Int): Int {
        var result = 0
        numbers.forEach{num: Int ->
            result = result + num
        }
        return result
    }

    fun minus(vararg  numbers: Int): Int {  // 10 1 2 3

        var result: Int = 0;

        if (numbers[0] != 0) {
            result = numbers[0]
        }

        for (i in 1 until numbers.size) {
            result = result - numbers[i]
        }
        return result
    }

    fun mutiply(vararg  numbers: Int): Int {
        var result = 1
        numbers.forEach { num: Int ->
           if(num != 0){
               result = result + num
           }
        }
        return result
    }

    fun divide(vararg  numbers: Int): Int {
        var result: Int = numbers[0]
        numbers.forEachIndexed { index, value ->
            if(index != 0){
                if(value != 0){
                    result = result / value
                }
            }
        }
        return result
    }

}

class Calculator3(val initialValue: Int){

    /*
        내가 만든 클래스는 어떤 자료형이 될수있다
    */

    var result2: Int = 0

    fun plus(number: Int): Calculator3{
        val result = this.initialValue + number
        result2 = result
        return Calculator3(result)  //
    }

    fun minus(number: Int): Calculator3{
        val result = this.initialValue - number
        result2 = result
        return Calculator3(result)
    }

    fun mltiply(number: Int): Calculator3{
        val result = this.initialValue * number
        result2 = result
        return Calculator3(result)
    }

    fun divide(number: Int): Calculator3{
        val result = this.initialValue / number
        result2 = result
        return Calculator3(result)
    }

}

class Calculator000() {
    fun plus(numers: List<Int>) {
        var result = 0
        numers.forEach {
            result = result + it
        }
        println(result)
    }
}
