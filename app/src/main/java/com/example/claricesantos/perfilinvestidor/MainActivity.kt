package com.example.claricesantos.perfilinvestidor

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setUpListeners()

        var nome: String = ""
        var nomes: Array<String>

        button_begin.setOnClickListener {
            var intent = Intent(this, QuestionsActivity::class.java)

            startActivity(intent)
        }
    }
    private fun setUpListeners() {
        button_begin.setOnClickListener {
            editText_yourName.text.isNotEmpty()

            startActivity(Intent(this, QuestionsActivity::class.java)).apply {
            }

        }

    }
}
