package br.com.ricardo.kotlinrepo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    val frase = "Kotlin é uma linguagem"
    val complemento = "Show!"
    val idade = 10

    val a = 10
    val b = 20
    val c = 30

    var numero = 10

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        calculaBonus(5, 6, 7)

        hello("Strange!")
        text_age.text = soma(3, 5).toString()

        println("numero++ = ${numero++}")

    }

    fun teste(){
        text_name.text = frase + "${complemento.length} $idade"
    }

    fun calculaBonus(a: Int, b: Int, c: Int){
        text_name.text = "A função é: ${a + b * c}"
    }

    fun hello(nome: String){

    }

    fun hello2(nome : String) : String = "Olá $numero"
    fun soma(a : Int, b : Int) : Int = a + b
}
