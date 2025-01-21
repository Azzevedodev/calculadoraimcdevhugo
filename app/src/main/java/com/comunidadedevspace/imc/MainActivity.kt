package com.comunidadedevspace.imc

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.google.android.material.snackbar.Snackbar
import com.google.android.material.textfield.TextInputEditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Recuperar os componentes EditText
         //  Criar uma variavel e associar o componente de UI<EditText>
        // Recuperar o botão da tela
        // Colocar acao no botao
        // recuperar o texto digitado no edtPeso

        val edtPeso = findViewById<TextInputEditText>(R.id.edt_peso)
        val edtAltura = findViewById<TextInputEditText>(R.id.edt_altura)

        val btnCalcular = findViewById<Button>(R.id.btn_calcular)

       btnCalcular.setOnClickListener {
           val peso = edtPeso.text
           val altura = edtAltura.text
           println("Hugo acao do botao" + peso + altura)
       }

    }
}