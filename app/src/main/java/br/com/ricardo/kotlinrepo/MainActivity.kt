package br.com.ricardo.kotlinrepo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var name : String = "Ricardo"
        var age : Int = 34
        var character: Char = 'r'

        var nome = "Ricardo Sousa"
        val idade = 34

        text_name.text = nome
        text_age.text = idade.toString()


    }
}
