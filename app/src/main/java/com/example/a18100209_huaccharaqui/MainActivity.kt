package com.example.a18100209_huaccharaqui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val etNumero1: EditText = findViewById(R.id.etNumero1)
        val etNumero2: EditText = findViewById(R.id.etNumero2)
        val btnEnviar: Button = findViewById(R.id.btnEnviar)

        btnEnviar.setOnClickListener {
            val numero1 = etNumero1.text.toString().toInt()
            val numero2 = etNumero2.text.toString().toInt()

            val intent = Intent(this, ResultadoActivity::class.java)
            intent.putExtra("numero1", numero1)
            intent.putExtra("numero2", numero2)
            startActivity(intent)
        }


    }
}