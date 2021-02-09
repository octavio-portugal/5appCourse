package com.a5appcurso

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var preference = PreferenceAnotacao(applicationContext)
        var editanotacao = editAnotacao
        var botao = floatingActionButton

        botao.setOnClickListener {

            val anotacaoRecuperada = editanotacao.text.toString()


            if(anotacaoRecuperada == ""){
                Toast.makeText(this, "Digite alguma coisa ...", Toast.LENGTH_SHORT).show()
            }else{
                preference.SalvarAnotacao(anotacaoRecuperada)
                Toast.makeText(this, "Anotação salva com Sucesso!", Toast.LENGTH_SHORT).show()
            }
        }
        val anotacao = preference.RecuperarAnotacao()
        if(anotacao != ""){
            editAnotacao.setText(anotacao)
        }


    }
}