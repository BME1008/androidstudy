package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.FragmentManager

class FragmentSelfStudyTwo : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fragment_self_study_two)

        val selftwo: FragmentSelfTwo = FragmentSelfTwo()
        val selfthree: FragmentSelfThree = FragmentSelfThree()

        val fragmentManager: FragmentManager = supportFragmentManager

        val fragmentTransaction = fragmentManager.beginTransaction()

        fragmentTransaction.add(R.id.container1, selftwo)
        fragmentTransaction.add(R.id.container2, selfthree)
        fragmentTransaction.commit()

    }
}
