package com.etecbauru.myapplication

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import org.w3c.dom.Text

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.exercicio_nota)

        val botaoExec1 = findViewById<Button>(R.id.btnExec1)
        val edtExec1 = findViewById<EditText>(R.id.edtExec1)
        val txtExec1 = findViewById<TextView>(R.id.txtExec1)
        botaoExec1.setOnClickListener {
            var numero = edtExec1.text.toString().toInt() * 2
            txtExec1.text = numero.toString()
        }


        /*
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

        val peso = findViewById<EditText>(R.id.edtPeso)
        val altura = findViewById<EditText>(R.id.edtAltura)
        val botaoIMC = findViewById<Button>(R.id.btnCalcularIMC)
        val resultadoIMC = findViewById<TextView>(R.id.txtExercicio2)

        botaoIMC.setOnClickListener {
            val p = peso.text.toString().toDouble()
            val a = altura.text.toString().toDouble()

            //peso / (altura * altura)
            val imc = p / ( a * a)

            if(imc < 18.5)
            {
                resultadoIMC.text = imc.toString() + " Abaixo do peso"
            }
            else if( imc >= 18.5 && imc <= 24.9)
            {
                resultadoIMC.text = imc.toString() +" Peso normal"
            }
            else if( imc >= 25 && imc <= 29.9)
            {
                resultadoIMC.text = imc.toString() +" Sobrepeso"
            }else{
                resultadoIMC.text = imc.toString() +" Obesidade"
            }
        }
        */
    }
}
