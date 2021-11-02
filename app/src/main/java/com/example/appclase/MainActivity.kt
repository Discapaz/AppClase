package com.example.appclase

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    private lateinit var nombre:EditText
    private lateinit var apellido:EditText


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        mostrarMensaje("ESTADO: en creacion")
       // val nombre = findViewById<EditText>(R.id.txt_nombre)
       // val apellido = findViewById<EditText>(R.id.txt_apellido)
        nombre = findViewById(R.id.txt_nombre)
        apellido = findViewById(R.id.txt_apellido)

        val btn_saludar = findViewById<Button>(R.id.registrar)
    }

    override fun onPause() {
        mostrarMensaje("ESTADO: pausado")
        super.onPause()
    }

    override fun onResume() {
        mostrarMensaje("ESTADO: en Resumen")
        super.onResume()
    }
    fun mostrarMensaje(mensaje: String){
        Toast.makeText(this,mensaje,Toast.LENGTH_LONG).show()
    }

    fun saludar(view: View) { // Metodo que invoco el Onclick
        val btn : Button = view as Button
        btn.text="Se hizo click"
        val saludar = findViewById<TextView>(R.id.tv_saludo)
       // val nombre = findViewById<EditText>(R.id.txt_nombre)
       //val apellido = findViewById<EditText>(R.id.txt_apellido)
        saludar.text="Saludando a : "+ nombre.text+" " + apellido.text
    }

    fun siguiente(view: android.view.View) {
        val pantalla = Intent (this, pag2::class.java)
        //val nombre = findViewById<EditText>(R.id.txt_nombre)
        //val apellido = findViewById<EditText>(R.id.txt_apellido)
        val dato=Bundle()
        dato.putString("dato","bienvenido: "+nombre.text+ " "+apellido.text)
        pantalla.putExtras(dato)
        startActivity(pantalla)
    }


}