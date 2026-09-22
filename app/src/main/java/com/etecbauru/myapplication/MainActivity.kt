package com.etecbauru.myapplication

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.aulaid)

        val notapP1 = findViewById<EditText>(R.id.edtNota1)
        val notapP2 = findViewById<EditText>(R.id.edtNota2)
        val resultado = findViewById<TextView>(R.id.txtResultado)
        val botao = findViewById<Button>(R.id.btnCalcular)

        botao.setOnClickListener {
            val soma = ( notapP1.text.toString().toFloat()
                        + notapP2.text.toString().toFloat()
                       )

            val media = soma / 2

           resultado.text = "Média é" + media

        }
    }
}
