package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class RecycclerViewActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recyccler_view)


        // 아이템 리스트 준비
        val carList = ArrayList<CarForList>()

        for(i in 0 until 10){
            carList.add(CarForList("" + i + "번째 자동차", "" + i + "순위 엔진"))
        }
    }
}

class Adapter(val itemList: ArrayList<CarForList>, val inflater: LayoutInflater): RecyclerView.Adapter<Adapter.ViewHolder>(){


    class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
        val carName: TextView
        val carEngine: TextView

        init{
            carName = itemView.findViewById(R.id.car_name)
            carEngine = itemView.findViewById(R.id.car_engine)
        }

    }

    override fun onCreateViewHolder(p0: ViewGroup, p1: Int): ViewHolder {
        val view = inflater.inflate(R.layout.item_view, parent, false)
        return Adapter.ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return itemList.size
    }

    override fun onBindViewHolder(p0: ViewHolder, p1: Int) {
        holder.carName.setText(itemList.get(postion).name)
        holder.carName.setText(itemList.get(postion).engine)
    }
}
