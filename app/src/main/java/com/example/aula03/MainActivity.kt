package com.example.aula03

import android.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Tipo de  Binding 1 - findViewById
        val editValor1: EditText = findViewById(R.id.editValor1)
        val editValor2: EditText = findViewById(R.id.editValor2)
        val somar: Button = findViewById(R.id.somar)
        val subtrair: Button = findViewById(R.id.subtrair)
        val multiplicar: Button = findViewById(R.id.multiplicar)
        val dividir: Button = findViewById(R.id.dividir)

        somar.setOnClickListener {
            val valor1 = editValor1.text.toString().toInt()
            val valor2 = editValor2.text.toString().toInt()
            val res = valor1 + valor2
            editValor1.setText("")
            editValor2.setText("")
            showDialog("O resultado é " + res )
        }

        subtrair.setOnClickListener {
            val valor1 = editValor1.text.toString().toInt()
            val valor2 = editValor2.text.toString().toInt()
            val res = valor1 - valor2
            editValor1.setText("")
            editValor2.setText("")
            showDialog("O resultado é " + res )
        }

        multiplicar.setOnClickListener {
            val valor1 = editValor1.text.toString().toInt()
            val valor2 = editValor2.text.toString().toInt()
            val res = valor1 * valor2
            editValor1.setText("")
            editValor2.setText("")
            showDialog("O resultado é " + res )
        }

        dividir.setOnClickListener {
            val valor1 = editValor1.text.toString().toInt()
            val valor2 = editValor2.text.toString().toInt()
            val res = valor1 / valor2
            editValor1.setText("")
            editValor2.setText("")
            showDialog("O resultado é " + res )
        }

    }

    fun showDialog(msg: String){
//        val builder = AlertDialog.Builder(this)
//        builder.setMessage(msg)
//        builder.setPositiveButton("Obrigado",null)
//        val dialog = builder.create()
//        dialog.show()

        AlertDialog.Builder(this)
        .setMessage(msg)
        .setPositiveButton("Obrigado",null)
        .create()
        .show()
    }
}