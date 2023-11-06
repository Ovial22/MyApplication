package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)

        val codigo = findViewById<TextView>(R.id.txtpag3Codigo)
        val Descripcionpag3 = findViewById<TextView>(R.id.DescripPag3)
        val TipoProducto = findViewById<EditText>(R.id.textpagCanridad)
        val Producto: String = intent.extras?.getString("Producto").orEmpty()
        val actulizarfondo: String = intent.extras?.getString("Saldo Actualizado").orEmpty()
        val guardar = findViewById<Button>(R.id.buttonpag3tranferir)

        guardar.setOnClickListener {
        val actulizarfondo = Producto.toInt() - Descripcionpag3.text.toString().toInt()
        val nuevo2 = Intent(this, MainActivity::class.java)
        nuevo2.putExtra("Codigo,", actulizarfondo.toString())
        startActivity(nuevo2)

       }


    }
}