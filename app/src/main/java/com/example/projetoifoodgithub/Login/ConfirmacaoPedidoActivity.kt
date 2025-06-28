package com.example.projetoifoodgithub.Login

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.projetoifoodgithub.databinding.ActivityConfirmacaoPedidoBinding

class ConfirmacaoPedidoActivity : AppCompatActivity() {

    private lateinit var binding: ActivityConfirmacaoPedidoBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityConfirmacaoPedidoBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnVoltar.setOnClickListener {
            finish()
        }

        binding.txtResumo.text = """Resumo dos valores
            Subtotal: R$ 100,00
            Taxa de entrega: R$ 6,90
            Total: R$ 106,90""".trimIndent()

        binding.btnAdicionarPagamento.setOnClickListener {

        }

        binding.btnConfirmar.setOnClickListener {

        }
    }
}
