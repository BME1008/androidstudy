package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.widget.LinearLayout
import android.widget.TextView

class AddViewActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add_view)

        // 아이템 리스트 준비
        val carList = ArrayList<CarForList>()

        for(i in 0 until 10){

            carList.add(CarForList("" + i + "번째 자동차", "" + i + "순위 엔진"))

        }

        val container = findViewById<LinearLayout>(R.id.addview_container)  // container 객체 가져옴

        // 현재 context 와 폰화면에 맞는 LayoutInflater 객체 생성
        // LayoutInflater 에서 제공하는 메소드 from() 이용
        val inflater = LayoutInflater.from(this@AddViewActivity)

        for(i in 0 until carList.size){

            // inflate() 로 item_view(SUB 페이지) 를 가져다가 inflate 진행, root는 어디가 붙이지는 않고 객체화해서 가지고만 있는다.
            val itemView = inflater.inflate(R.layout.item_view, null)

            var carNameView =  itemView.findViewById<TextView>(R.id.car_name)
            var carEngineView =  itemView.findViewById<TextView>(R.id.car_engine)

            carNameView.setText(carList.get(i).name)
            carEngineView.setText(carList.get(i).engine)

            container.addView(itemView) // container에 attach를 진행


            /*inflater.inflate(int resource, ViewGroup root, boolean attachToRoot);

            1) root
            attachToRoot가 true일경우 생성되는 View가 추가될 부모 뷰
            attachToRoot가 false일 경우에는 LayoutParams값을 설정해주기 위한 상위 뷰
                    null로 설정할경우 android:layout_xxxxx값들이 무시됨.

            2) attachToRoot

            true일 경우 생성되는 뷰를 root의 자식으로 만든다.
            false일 경우 root는 생성되는 View의 LayoutParam을 생성하는데만 사용된다.*/

        }

    }
}


class CarForList(val name: String, val engine: String){

}