package com.example.myapplication

import android.app.Activity
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_self_study_recycler_view.*

class SelfStudyRecyclerView : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_self_study_recycler_view)

        val nameList = ArrayList<PersonName>()

        for (i in 0 until 15) {
            nameList.add(PersonName("$i 번째 사람"))
        }

        self_study_recycler_view001.adapter = SelfStudyRecyclerViewAdapter(nameList, LayoutInflater.from(this@SelfStudyRecyclerView))
        self_study_recycler_view001.layoutManager = LinearLayoutManager(this@SelfStudyRecyclerView)

        // val adapter = SelfStudyRecyclerViewAdapter(nameList, LayoutInflater.from(this@SelfStudyRecyclerView))
        // self_study_recycler_view001.adapter = adapter
        //self_study_recycler_view001.layoutManager = LinearLayoutManager(this@SelfStudyRecyclerView)
    }
}

class SelfStudyRecyclerViewAdapter(
    val nameList: ArrayList<PersonName>,
    val inflater: LayoutInflater
): RecyclerView.Adapter<SelfStudyRecyclerViewAdapter.ViewHolder>(){

    // ▼ onCreateViewHolder(){ } 에서 inflate진행한 layout xml을 인자로 받음서 사용
    inner class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
        val self_name: TextView

        init{
            self_name = itemView.findViewById(R.id.self_name)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        // ▼ inflate 진행하는 layout xml 파일이 itemView로 사용됨
        val view = inflater.inflate(R.layout.self_study_recycler_item,parent,false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return nameList.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.self_name.setText(nameList.get(position).name)
    }
}

class NameBook(){
    val nameList = ArrayList<PersonName>()
    fun addPersonName(personName: PersonName){
        nameList.add(personName)
    }
}

class PersonName(val name: String){ }

/*

class OOOOOO(
    val ㅁㅁㅁㅁㅁ: ArrayList<PersonName>,
    val inflater: LayoutInflater
): RecyclerView.Adapter<OOOOOO.ViewHolder>(){

    inner class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
        val XXXXX: TextView

        init{
            XXXXX = itemView.findViewById(R.id.XXXXX)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = inflater.inflate(R.layout.ㄱㄱㄱㄱㄱㄱ,parent,false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return ㅁㅁㅁㅁㅁ.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.XXXXX.setText(ㅁㅁㅁㅁㅁ.get(position).name)
    }
}

*/
