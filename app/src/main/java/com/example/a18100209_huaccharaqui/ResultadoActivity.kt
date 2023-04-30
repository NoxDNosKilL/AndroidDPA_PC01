package com.example.a18100209_huaccharaqui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.widget.Button
import android.widget.TextView
import android.os.Bundle

class ResultadoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_resultado)

        val numero1 = intent.getIntExtra("numero1", 0)
        val numero2 = intent.getIntExtra("numero2", 0)

        val suma = numero1 + numero2
        val resta = numero1 - numero2
        val multiplicacion = numero1 * numero2
        val division  = numero1.toDouble() / numero2.toDouble()

        val tvSuma: TextView = findViewById(R.id.tvSuma)
        val tvResta: TextView = findViewById(R.id.tvResta)
        val tvMultiplicacion: TextView = findViewById(R.id.tvMultiplicacion)
        val tvDivision: TextView = findViewById(R.id.tvDivision)

        tvSuma.text = "$suma"
        tvResta.text = "$resta"
        tvMultiplicacion.text = "$multiplicacion"
        tvDivision.text = "$division"

        val btnVolverResultados: Button = findViewById(R.id.btnVolverResultados)
        btnVolverResultados.setOnClickListener {
            val intent = Intent(this,MainActivity::class.java)
            startActivity(intent)
        }
    }


}