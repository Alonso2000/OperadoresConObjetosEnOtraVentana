package com.example.masventanasconobjetos

class Operadores :java.io.Serializable{
    var num1:Double
    var num2:Double
    var r:Double=0.0

    constructor(n1:Double, n2:Double){
        this.num1 = n1
        this.num2 = n2
    }


    fun sumar(){
        this.r=this.num1 + this.num2
    }

    fun restar(){
        this.r=this.num1 - this.num2
    }

    fun multiplicar(){
        this.r=this.num1 * this.num2
    }


    fun dividir(){
        this.r=this.num1 / this.num2
    }

    override fun toString(): String {
        return "Operadores(num1=$num1, num2=$num2, r=$r)"
    }


}