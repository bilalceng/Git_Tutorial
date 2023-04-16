package com.bilalberek.gittutorial2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        println("this the first commit")
    }

    fun empty(name: String?){

    }

    fun myEmpty(){

    }

    fun emptyempty(){
        Toast.makeText(this, "yarak", Toast.LENGTH_SHORT).show()

    }

    fun myfunfufn(){

    }


}