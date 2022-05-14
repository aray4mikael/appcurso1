package com.example.passarosapp

import android.app.Activity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import android.widget.Toast

class MainActivity : Activity(){

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        Toast.makeText(this, "Olá mundo do kotlin", Toast.LENGTH_SHORT).show()
//        val view = TextView(this)
//        view.setText("cesta de frutas")
//        setContentView(view)
        setContentView(R.layout.activity_main)
    }

}