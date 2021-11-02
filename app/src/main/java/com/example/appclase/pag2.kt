package com.example.appclase

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class pag2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pag2)
        val recoger = findViewById<TextView>(R.id.txt_recoger)
        intent.extras?.getString("dato","No  llego Dato")?.let {
            recoger.setText(it)
        }
    }


}