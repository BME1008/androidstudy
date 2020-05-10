package com.example.myapplication.Kotlin

/*
   3) TV 클래스
       - on/off 기능
       - 채널을 돌리는 기능
       - 초기 채널은 (S사 M사 K사 3개)
*/

fun main(array: Array<String>) {
   /* val channels = listOf<String>("KBS","MBC","SBS")
    val tv = TV(channels)*/

    val tv = TV(listOf<String>("KBS","MBC","SBS"))

    tv.channelUp()
    println(tv.checkCurrentChannel())
    tv.channelUp()
    println(tv.checkCurrentChannel())
    tv.channelUp()
    println(tv.checkCurrentChannel())
    tv.channelUp()
    println(tv.checkCurrentChannel())

    tv.currenChannelNumber

/*
    tv.channelDown()
    println(tv.checkCurrentChannel())
    tv.channelDown()
    println(tv.checkCurrentChannel())
    tv.channelDown()
    println(tv.checkCurrentChannel())
    tv.channelDown()
    println(tv.checkCurrentChannel())
*/

/*
    println(tv.checkCurrentChannel())
    tv.channelDown()
    println(tv.checkCurrentChannel())
*/

}

class TV(val channels: List<String>){

    var onOrOff: Boolean = false    // True -> On, False -> Off

    // 생성한 변수 바로 아래다 set(){}을 사용
    var currenChannelNumber = 0
        set(value) {        // currenChannelNumber 에 값이 할당될때 set() 함수가 동작함
            field = value  // field로 currenChannelNumber 에 값 변경을 안해주면 currenChannelNumber는 계속해서0

            if(field > 2){
                field = 0
            }else if (field < 0 ){
                field = 2
            }
        }

    get(){      // 누군가에 의해서 변수가 불려서 사용될때는 get() 호출
        return field
    }

    fun switch(){
        onOrOff = !onOrOff
    }

    fun checkCurrentChannel(): String {
        return channels[currenChannelNumber]
    }

    fun channelUp(){

        currenChannelNumber = currenChannelNumber + 1

       /*
            불필요하게 반복문으로 만들어 보면?

            channels.forEachIndexed{index, value->
            if(currenChannelNumber == index){
                currenChannelNumber = currenChannelNumber + 1
                return
            }
        }*/
    }

    fun channelDown(){
        currenChannelNumber = currenChannelNumber - 1

       /*
            불필요하게 반복문으로 만들어 보면?

            channels.forEachIndexed{index, value->
            if(currenChannelNumber == index){
                currenChannelNumber = currenChannelNumber - 1
                return
            }
        }*/
    }

}