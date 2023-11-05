package com.example.register.loginActivitys

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.register.DatabaseHelper
import com.example.register.databinding.RegistrolayoutBinding
import com.example.register.Entidades.User
import com.example.register.LoginActivity

class RegistroActivity : AppCompatActivity() {

    //Carregar Layout
    private lateinit var layout: RegistrolayoutBinding

    //Pegar Instancia do Bd Helper
    private val dao by lazy {
        DatabaseHelper.pegarInstancia(this).userDao()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        //Rodar Layout
        layout = RegistrolayoutBinding.inflate(layoutInflater)
        setContentView(layout.root)

        //Navegar para tela de Login
        layout.navegarLogin.setOnClickListener {
            val irParaLogin = Intent(this, LoginActivity::class.java)
            startActivity(irParaLogin)
        }

        //Pegar valores dos inputs
        layout.botao.setOnClickListener{
            val nome = layout.inputNome.text.toString()
            val email = layout.inputEmail.text.toString()
            val senha = layout.inputSenha.text.toString()

            val usuario = User(nome, email, senha)

            try {
                dao.registrar(usuario)
                finish()
            }
            catch (e: Exception) {
                Log.e("MYAPP", "exception", e)
            }

        }

        setContentView(layout.root)



    }
}