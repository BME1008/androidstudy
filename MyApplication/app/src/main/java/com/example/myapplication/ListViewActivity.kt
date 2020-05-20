package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_list_view.*

class ListViewActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list_view)

        // 아이템 리스트 준비
        val carList = ArrayList<CarForList>()

        for(i in 0 until 10){
            carList.add(CarForList("" + i + "번째 자동차", "" + i + "순위 엔진"))
        }

        val adapter = ListViewAdapter(carList, LayoutInflater.from(this@ListViewActivity))
        listView.adapter = adapter  // listView는 activity_list_view.xml의 id 값
        listView.setOnItemClickListener { parent, view, position, id ->
            var carName = (adapter.getItem(position) as CarForList).name
            var carEngine = (adapter.getItem(position) as CarForList).engine

            Toast.makeText(this@ListViewActivity, carName + carEngine, Toast.LENGTH_SHORT).show()

        }
    }
}


class ListViewAdapter(
    val carForList: ArrayList<CarForList>,  // List를 그릴 대상
    val layoutInflater: LayoutInflater
): BaseAdapter(){

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
    /* 개선전 로직
        val view = layoutInflater.inflate(R.layout.item_view, null)

        val carNameTextview = view.findViewById<TextView>(R.id.car_name)
        val carEngineTextview = view.findViewById<TextView>(R.id.car_engine)

        carNameTextview.setText(carForList.get(position).name)
        carEngineTextview.setText(carForList.get(position).engine)

        return view
    */
        /* holder 를 사용해서 개선 로직 */
        val view: View
        val holder: ViewHolder

        if(convertView == null){
            view = layoutInflater.inflate(R.layout.item_view, null)
            holder = ViewHolder()

            holder.carName = view.findViewById(R.id.car_name)
            holder.carEngine = view.findViewById(R.id.car_engine)

            view.tag = holder
        }else{
            holder = convertView.tag as ViewHolder
            view = convertView
        }

        holder.carName?.setText(carForList.get(position).name)
        holder.carEngine?.setText(carForList.get(position).engine)

        return view
    }

    override fun getItem(position: Int): Any {  // position은 리스트뷰에 Item숫자 이렇게 써진 순서를 반환
        return carForList.get(position) // 그리고자 하는 아이템 리스트의 하나 (postion에 해당하는)
    }

    override fun getItemId(position: Int): Long {    // position은 리스트뷰에 Item숫자 이렇게 써진거에 ID를 부여하는거 0 ~ n 부여
        return position.toLong()   // 해당 포지션에 위치해 있는 아이템 뷰의 아이디 설정
    }

    override fun getCount(): Int {
        return carForList.size  // 내가 그릴 리스트의 전체 갯수를 반환
    }

}

class ViewHolder{
    var carName: TextView? = null
    var carEngine: TextView? = null
}