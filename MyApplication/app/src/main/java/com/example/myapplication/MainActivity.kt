package com.example.myapplication

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


    fun main()
    {

        var codigoProducto = findViewById<EditText>(R.id.codigo)
        var ingresoDescripcion = findViewById<Button>(R.id.buttonIngresoDescripcion)
        var PrecioProcducto = findViewById<Button>(R.id.buttoningresoPrecio)
        var crear = findViewById<Button>(R.id.buttonCrear).text.toString()
        val Perecedero = 1
        val NoPerecedro = 2


    fun expiraciones() {
        val expiracio1 = (PrecioProcducto / 4)
        val expiracion2 = (PrecioProcducto / 3)
        val expiracion3 = (PrecioProcducto/2)
    }
    fun ReduccionDePrecios1(num1:Double, num2:Double){
        print("a su producto le queda 1 dia para expirar, se ha modificado el precio a ${expiracio1}")
    }
    fun ReduccionDePrecios2(num1:Double, num2:Double){
        print("a su producto le queda 1 dia para expirar, se ha modificado el precio a ${expiracio2}")
    }
    fun ReducionDePrecios3(num1:Double, num2:Double){
        print("a su producto le queda 1 dia para expirar, se ha modificado el precio a ${expiracio3}")
    }

    }

            Proceder.setOnClickListener {
                if (crear == ())
                {
                    val creacion1 = Intent(this, MainActivity2::class.java)
                    startActivity(creacion1)

                }
                else
                {Mensaje.setOnClickListener {
                    Toast.makeText(
                        this,
                        "Los Datos no son correctos o le le falta un dato a rellenar" + crear.text.toString(),
                        Toast.LENGTH_LONG
                    ).show()}}
                 }


            }

        }



