package com.bilalberek.gittutorial2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        println("this the first commit")
    }

    fun empty(name: String?){

    }

    fun newEmpty(){

    }

}