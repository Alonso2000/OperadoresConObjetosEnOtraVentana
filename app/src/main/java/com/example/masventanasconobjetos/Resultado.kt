package com.example.masventanasconobjetos

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.masventanasconobjetos.databinding.ActivityResultadoBinding

class Resultado : AppCompatActivity() {
    lateinit var binding: ActivityResultadoBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_resultado)
        binding = ActivityResultadoBinding.inflate(layoutInflater)
        setContentView(binding.root)

        var op:Operadores = intent.getSerializableExtra("resultado") as Operadores
        binding.txtResultado.text = op.r.toString()

        binding.btnVolver.setOnClickListener {
            finish()
        }
    }
}