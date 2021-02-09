package com.a5appcurso

import android.content.Context
import android.content.SharedPreferences

class PreferenceAnotacao (private val context: Context){

    private val CHAVE = "nome"
    private val ARQUIVO ="anotacao.preferencia"
    private val preferences: SharedPreferences
    private val editor: SharedPreferences.Editor

    fun SalvarAnotacao(anotacao: String?){

        editor.putString(CHAVE, anotacao)
        editor.commit()
    }


    fun RecuperarAnotacao(): String?{
        return preferences.getString(CHAVE, "")
        

    }

    init{
        preferences =context.getSharedPreferences(ARQUIVO, 0)
        editor = preferences.edit()
    }
}