package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import com.example.myapplication.R.*

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(layout.activity_main2)

        val codigoPerecible = findViewById<Button>(R.id.pag2buttonPerecible)
        val DescripcionPerecible = findViewById<TextView>(R.id.editTextTextDescripcionPerecible)
        val DiasVencer:String = intent.extras?.getString("Dias para vencer ${expiraciones}").toString()
        var NuevoValor = findViewById<TextView>(R.id.editTextNevoValor)

        fun dividir(num1:Double, num2:Double) {
            println("la division del producto es la siguinte ${num1 / num2}")

            if (DiasVencer == "1") {
                println("la division por perecidad es ${dividir(n1, n2)}")
            } else if (DiasVencer == "2") {
                println("La division por perecidad es ${dividir(n1, n2)}")
            } else if (DiasVencer == "3") {
                println("La division por perecidad es ${dividir(n1, n2)}")
            } else {
                println("ha ocurrido un error con su division del procducto")
            }
        }
        if (codigoPerecible.isEmpty())
        {
            Toast.makeText(this, "Codigo invalido", Toast.LENGTH_LONG)
        }
        else
        {
            cantidadfija.text = nuevaCantidad
        }

        codigoPerecible.setOnClickListener{
            val iratranferenciaspag3 = Intent (this, MainActivity3::class.java)
            iraMainpag3.putExtra("Producto",cantidadfija.text.toString() )
            startActivity(iraMainpag3)}

    }
}