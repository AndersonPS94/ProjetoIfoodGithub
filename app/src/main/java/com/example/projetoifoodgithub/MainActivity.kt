package com.example.projetoifoodgithub

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.projetoifoodgithub.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(binding.root)

        logarUsuario()
        cadastrarUsuario()

    }

    private fun logarUsuario() {
        binding.editLoginEmail.text
        binding.editLoginSenha.text

        //ADICIONAR A LOGICA DO LOGIN AQUI
        binding.btnLogin.setOnClickListener {}
    }

    //ADICIONAR A LOGICA DO CADASTRO AQUI, CASO FEITA
    private fun cadastrarUsuario() {
        binding.textCadastro.setOnClickListener {}
    }
}