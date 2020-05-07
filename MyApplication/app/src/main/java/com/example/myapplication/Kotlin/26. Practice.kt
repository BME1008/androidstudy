package com.example.myapplication.Kotlin

// 과제
// Night(), Monster() (부모) - > Charactor()로 바꿔버리자
// SuperNight, SuperMonster (자식)

fun main(args: Array<String>){

    val monster = SuperMonster11(100,10)
    val night = SuperNight11(130,8)

    monster.attack(night)
    monster.bite(night)
}
/*
    상속이 만들어낸 특징
        @자식 클래스는 부모 클래스의 타입이다.
        @부모 클래스는 자식 클래스의 타입이 아니다.

        EX)
        슈퍼카 클래스(자식)가 자동차 클래스(부모) 를 상속 받는다.
         ==>> 모든 슈퍼카가 자동차인건 맞지만 모든 자동차가 슈퍼카는 아니다.
*/
open class Charator(var hp: Int, val power:Int){
    /* 혹시 power값이 안넘어올 경우를 대비해서 기본값을 this.power로 설정 */
    open fun attack(charator: Charator, power: Int = this.power){
        charator.defense(power)
    }

    open fun defense(damage: Int) {
        hp -= damage

        if (hp > 0) println("${javaClass.simpleName}의 남은 체력 $hp")   // ${javaClass.simpleName}은 클래스의 이름이 나온다
        else println("사망 했습니다. ")
    }
}

/*
    @ 자식 클래스가 인스턴스화  되기 위해서 부모 클래스가 선행되어 인스턴스화 되어야 한다.
    @ 부모 생성자에서 넘어오는 애들은 val var을 붙이면 안된다 .
        이미 Monster11(var hp: Int, val power: int)로 선언이 되어있으니
        SuperMonster11 에서는  SuperMonster11(hp: Int, power: Int)로 사용을 한다.
        단!!) 부모 클래스에 없는 애들은 val item: String 처럼 추가 가능
*/
class SuperMonster11(hp: Int, power: Int): Charator(hp, power){

    fun bite(charator: Charator){
        super.attack(charator, power +2)
    }
}

class SuperNight11(hp: Int, power: Int): Charator(hp, power){

    val defensePower = 2

    override fun defense(damage: Int) {
        super.defense(damage - defensePower)
    }
}

// - 처음 작성한거 -
/*
    open class Monster11(var hp: Int, val power: Int){
    open fun attack(){ }
    open fun defense(){ }
}

open class Night11(var hp: Int, val power: Int){
    open fun attack(){ }
    open fun defense(){ }
}

class SuperMonster11(hp: Int, power: Int): Monster11(hp, power){ }
class SuperNight11(hp: Int, power: Int): Night11(hp, power){ }
*/