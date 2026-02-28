package com.example.coversor_moneda

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import androidx.activity.viewModels

class CurrencyActivity : AppCompatActivity() {
    private val viewModel: CurrencyViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_currency)

        val etSoles = findViewById<EditText>(R.id.etSoles)
        val tvRes = findViewById<TextView>(R.id.tvDolares)

        viewModel.dolares.observe(this) { texto ->
            tvRes.text = texto
        }

        findViewById<Button>(R.id.btnConvertir).setOnClickListener {
            val monto = etSoles.text.toString().toDoubleOrNull()?: 0.0
            viewModel.convertir(monto)
        }
    }
}

//enableEdgeToEdge()