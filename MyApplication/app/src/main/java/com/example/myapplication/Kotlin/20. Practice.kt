package com.example.myapplication.Kotlin

/*
    2) 은행 계좌 만들기
        - 계좌 생성 기능 (이름, 생년 월일, 초기금액)
        - 잔고를 확인 하는 기능
        - 출금 기능
        - 예금 기능
*/

fun main(array: Array<String>){

    val account : Account = Account("홍길동", "1990/3/1", 1000)

    println(account.checkBalance())
    println(account.save(1000))
    println(account.withdrwa(2000))
    println(account.balance)

    val account2 : Account = Account("홍길동", "1990/3/1", -2000)
    println("\n"+account.checkBalance())

    val account3  = Account2("홍길동", "1990/3/1")
    println("\n" + account3.checkBalance())

}

// constructor() 를 만들면 Class명 옆에 ()는 빠짐
class Account{

    val name: String
    val bith: String
    var balance: Int

    // 생성자
    constructor( name: String,  bith: String,  balance: Int){
        this.name = name
        this.bith = bith

        if(balance >= 0) {
            this.balance = balance
        }else{
            this.balance = 0
        }
    }

    fun checkBalance(): Int{
        return balance
    }

    fun withdrwa(amount: Int): Boolean{

        if(balance >= amount){
            balance = balance - amount
            return true
        }else{
            return false
        }

    }

    fun save(amount: Int){
        balance = balance + amount
    }

}
                                                                       /* balance 값이 없으면 기본 1000 */
class Account2(val name: String, val birth: String, var balance: Int = 1000){

    fun checkBalance(): Int{
        return balance
    }

    fun withdrwa(amount: Int): Boolean{

        if(balance >= amount){
            balance = balance - amount
            return true
        }else{
            return false
        }

    }

    fun save(amount: Int){
        balance = balance + amount
    }

}

// val 인지 var 인지 선언하지 않은 파라메터로 받아서 사용이 가능
class Account3(initialBalance: Int){

    // 이럴 경우 변수화해서 만들어줘야지 사용이 가능
    val balance: Int = if(initialBalance >=0) initialBalance else 0     //value 검열이 가능함

    fun checkBalance(): Int{
        return balance
    }

}