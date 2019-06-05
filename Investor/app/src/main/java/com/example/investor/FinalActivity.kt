package com.example.investor

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_final.*

class FinalActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_final)

        var yourFinalName = this.intent.getStringExtra("yourFinal")
        yourResult_textView.text = "${yourFinalName}, a sua pontuacao eh de: "
    }
}
