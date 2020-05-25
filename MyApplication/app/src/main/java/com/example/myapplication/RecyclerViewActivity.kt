package com.example.myapplication

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_recycler_view.*


/*
    001 > 002 > 003 > 004 > 005 > 008 > 008 > 006 > 007 > 009 > 010
 */
class RecyclerViewActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recycler_view)

        //Log.d("CHECKED","001")
        val carList = ArrayList<CarForList>()
        //Log.d("CHECKED","002")
        for (i in 0 until 50) {
            carList.add(CarForList("" + i + " 번째 자동차", "" + i + "순위 엔진"))
        }
        //Log.d("CHECKED","003")

        val adapter = RecyclerViewAdapter(carList, LayoutInflater.from(this@RecyclerViewActivity))
        //Log.d("CHECKED","004")

        recycler_view.adapter = adapter
        recycler_view.layoutManager = LinearLayoutManager(this@RecyclerViewActivity)
        //Log.d("CHECKED","005")
         //recycler_view.layoutManager = GridLayoutManager(this@RecyclerViewActivity, 2)
    }
}

class RecyclerViewAdapter(
    var itemList: ArrayList<CarForList>,
    val inflater: LayoutInflater
) : RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder>() {

    // 여기서 ViewHolder 만듬
    // (itemView: View) ViewHolder의 생성자안에 .ViewHolder()에서 사용할 View가 들어있다.
    /*
        ViewHolder는 inner클래스라 outter 클래스에 변수들에 접근을 할수없다.
        inner 클래스에서 outter 클래스로 접근하고 싶으면
        inner 라는 명령어를 붙여주면  RecyclerViewAdapter 클래스에 ViewHolder가 속하게 만듬
        그래서 outter클래스에 변수들을 사용 가능
    */
     inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val carName: TextView
        val carEngine: TextView

        init {
            carName = itemView.findViewById(R.id.car_name)
            carEngine = itemView.findViewById(R.id.car_engine)

            itemView.setOnClickListener {
                val position:Int = adapterPosition
                val engineName = itemList.get(position).engine
                Log.d("engine", " :: " + engineName)
            }
        }
    }

    // 호출 순서 :: onCreateViewHolder(){ } ->  ViewHolder(){ } -> onBindViewHolder(){ }
    // viewType 형태의 아이템 뷰를 위한 뷰홀더 객체 생성.
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {

        //Log.d("CHECKED","006")

        val view = inflater.inflate(R.layout.item_view, parent, false)
        //Log.d("CHECKED","007")
        return ViewHolder(view)
    }

    // 전체 아이템 갯수를 리턴
    override fun getItemCount(): Int {
        //Log.d("CHECKED","008")
        return itemList.size
    }

    // ListView로 치면 ViewHolder 에서 tag 역할 (만든걸 다시 재활용 하는 역할)
    // position에 해당하는 데이터를 뷰홀더의 아이템뷰에 표시.
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        //Log.d("CHECKED","009")

        holder.carName.setText(itemList.get(position).name)
        holder.carEngine.setText(itemList.get(position).engine)

        //Log.d("CHECKED","010")
    }
}