package com.example.projetoifoodgithub

import android.os.Bundle
import android.widget.*
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnVoltar = findViewById<ImageView>(R.id.btnVoltar)
        val txtResumo = findViewById<TextView>(R.id.txtResumo)
        val btnAdicionarPagamento = findViewById<Button>(R.id.btnAdicionarPagamento)
        val btnConfirmar = findViewById<Button>(R.id.btnConfirmar)

        btnVoltar.setOnClickListener {

        }


        txtResumo.text = """ Resumo dos valores   Subtotal: R$ 100,00 Taxa de entrega: R$ 6,90 Total: R$ 106,90""".trimIndent()

        btnAdicionarPagamento.setOnClickListener {

        }


        btnConfirmar.setOnClickListener {

        }
    }
}