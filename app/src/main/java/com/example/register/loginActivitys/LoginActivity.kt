package com.example.register

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.register.databinding.LoginlayoutBinding
import android.content.Intent
import com.example.register.loginActivitys.RegistroActivity

class LoginActivity : AppCompatActivity() {

 private lateinit var layout: LoginlayoutBinding // "LoginLayout" sendo o nome do layout e "Binding" sendo a biblioteca


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        layout = LoginlayoutBinding.inflate(layoutInflater) // Layout inflado através do layoutInflater
        setContentView(layout.root) // binding.root faz o papel de R.layout.loginlayout para carregar o layout

        layout.navegarCadastro.setOnClickListener { // Evento 'onclick' no elemento de id "navegar_cadastro'

            //                   Nova intenção     Activity atual    Activity Destino
            val irParaCadastro = Intent(this,           RegistroActivity::class.java)
            startActivity(irParaCadastro) //Inicia nova activity através de uma intenção "Intent"
        }


    }


}

//README

// Adicionar a build.gradle.kts abaixo de kotlin Options

//viewBinding {
//    enable = true
//}

// Lembrar se caso mudar a tela inicial, Mudar tambem no AndroidManifest