package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_calculat.*

class Calculat : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calculat)

        var new = "0"
        var old = "0"

        text0.setOnClickListener {
            new = new + "0"
            text.setText(new)
        }

        text1.setOnClickListener  {
            new = new + "1"
            text.setText(new)
        }

        text2.setOnClickListener  {
            new = new + "2"
            text.setText(new)
        }

        text3.setOnClickListener  {
            new = new + "3"
            text.setText(new)
        }

        text4.setOnClickListener  {
            new = new + "4"
            text.setText(new)
        }

        text5.setOnClickListener  {
            new = new + "5"
            text.setText(new)
        }

        text6.setOnClickListener  {
            new = new + "6"
            text.setText(new)
        }

        text7.setOnClickListener  {
            new = new + "7"
            text.setText(new)
        }

        text8.setOnClickListener  {
            new = new + "8"
            text.setText(new)
        }

        text9.setOnClickListener  {
            new = new + "9"
            text.setText(new)
        }

        textCA.setOnClickListener  {
            new = "0"
            old = "0"
            text.setText("0")
        }

        textPlus.setOnClickListener  {
            old = (old.toInt() + new.toInt()).toString()
            new = "0"
            text.setText(old)
        }

    } /* -end- onCreate */
} /* -end- Class Calculat */
