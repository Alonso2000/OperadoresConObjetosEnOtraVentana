package com.example.masventanasconobjetos

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.masventanasconobjetos.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    fun comporbarVacio():Int = if(binding.edNum1.text.isNotEmpty() || binding.edNum2.text.isNotEmpty()){
            1
        }else{
            2
        }

    lateinit var binding: ActivityMainBinding
    var n:Int = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_main)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnSuma.setOnClickListener {
            n = comporbarVacio()
            if(n==1){
                var operacion = Operadores(binding.edNum1.text.toString().toDouble(), binding.edNum2.text.toString().toDouble())
                operacion.sumar()
                var int: Intent = Intent(this,Resultado::class.java)
                int.putExtra("resultado",operacion)
                startActivity(int)
            }else{
                Toast.makeText(this,"NO HAY NUMEROS PARA OPERAR", Toast.LENGTH_SHORT).show()
            }
        }

        binding.btnResta.setOnClickListener {
            n = comporbarVacio()
            if(n==1){
                var operacion = Operadores(binding.edNum1.text.toString().toDouble(), binding.edNum2.text.toString().toDouble())
                operacion.restar()
                var int: Intent = Intent(this,Resultado::class.java)
                int.putExtra("resultado",operacion)
                startActivity(int)
            }else{
                Toast.makeText(this,"NO HAY NUMEROS PARA OPERAR", Toast.LENGTH_SHORT).show()
            }
        }

        binding.btnMulti.setOnClickListener {
            n = comporbarVacio()
            if(n==1){
                var operacion = Operadores(binding.edNum1.text.toString().toDouble(), binding.edNum2.text.toString().toDouble())
                operacion.multiplicar()
                var int: Intent = Intent(this,Resultado::class.java)
                int.putExtra("resultado",operacion)
                startActivity(int)
            }else{
                Toast.makeText(this,"NO HAY NUMEROS PARA OPERAR", Toast.LENGTH_SHORT).show()
            }
        }

        binding.btnDividir.setOnClickListener {
            n = comporbarVacio()
            if (n == 1) {
                if (binding.edNum2.text.toString().toDouble() != 0.0 || binding.edNum2.text.toString().toInt() != 0) {
                    var operacion = Operadores(binding.edNum1.text.toString().toDouble(), binding.edNum2.text.toString().toDouble())
                    operacion.dividir()
                    var int: Intent = Intent(this, Resultado::class.java)
                    int.putExtra("resultado", operacion)
                    startActivity(int)
                }else{
                    Toast.makeText(this, "NO SE PUEDE DIVIDIR POR 0", Toast.LENGTH_SHORT).show()
                }
            }else{
                Toast.makeText(this, "NO HAY NUMEROS PARA OPERAR", Toast.LENGTH_SHORT).show()
            }
        }
    }
}