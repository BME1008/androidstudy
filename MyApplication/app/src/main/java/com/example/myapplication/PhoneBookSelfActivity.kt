package com.example.myapplication


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.widget.LinearLayout
import android.widget.TextView

class PhoneBookSelfActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_phone_book_self)

        LeftView()
        RightView()
    }


    fun LeftView(){

        val createatoz: CreateAtoZ = CreateAtoZ()
        val atoz = createatoz.atoz()

        val leftContainer = findViewById<LinearLayout>(R.id.book_left_container)
        val layoutInflater = LayoutInflater.from(this@PhoneBookSelfActivity)

        for(i in 0 until atoz.size){

            val leftVeiw = layoutInflater.inflate(R.layout.activity_phone_book_self_item,null, false)
            val view = leftVeiw.findViewById<TextView>(R.id.left_view)

            view.setText(atoz.get(i))

            leftContainer.addView(leftVeiw)
        }
    }

    fun RightView(){

        val result = createFakeNumber(100, PhoneBookSelf())

        val rightContainer = findViewById<LinearLayout>(R.id.book_right_container)
        val layoutInflater = LayoutInflater.from(this@PhoneBookSelfActivity)

        for(i in 0 until result.personList.size){

            val rightView = layoutInflater.inflate(R.layout.activity_phone_book_self_item2, null, false)
            val view = rightView.findViewById<TextView>(R.id.right_view)

            view.setText(result.personList.get(i).name + "//"+ result.personList.get(i).number)
            rightContainer.addView(rightView)
        }
    }

    fun createFakeNumber(num: Int, phonebookbelf: PhoneBookSelf): PhoneBookSelf{

        val temp = CreateAtoZ()
        val temp2 = temp.atoz()

            for (j in 0 until temp2.size) {
                phonebookbelf.addPersonSerlf(
                    PersonBookSelf(name = temp2.get(j), number = "010-1234-" + j)
                )
            }
        return phonebookbelf
    }
}

class CreateAtoZ{

    fun atoz(): Array<String>{
        var aToz = arrayOf<String>("A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z")

        return aToz
    }
}


class PhoneBookSelf{

    val personList = ArrayList<PersonBookSelf>()

    fun addPersonSerlf(personBookSelf: PersonBookSelf){
        personList.add(personBookSelf)
    }
}

class PersonBookSelf(val name: String, val number: String){  }
/*
    var name: String = ""   // 변수 초기화
    var number: String = "" // 변수 초기화

    constructor(name: String, number: String){
        this.name = name
        this.number = number
    }
}
*/



