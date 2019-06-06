package br.com.ricardo.kotlinrepo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    val frase = "Kotlin é uma linguagem"
    val complemento = "Show!"
    val idade = 10

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        

    }

    fun teste(){
        text_name.text = frase + "${complemento.length} $idade"
    }
}
