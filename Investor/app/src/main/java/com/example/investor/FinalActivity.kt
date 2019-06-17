package com.example.investor

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_final.*

class FinalActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_final)

        var yourFinalName = this.intent.getStringExtra("yourFinal")
        var finalPoints = this.intent.getIntExtra("finalPoints", 0)
        yourResult_textView.text = "${yourFinalName},\n\nSua pontuacao foi: ${finalPoints} pontos. \nIsso significa que seu perfil eh:"


        if (finalPoints >= 30 ){
            profile_textView.text = "Arrojado!! \n${getString(R.string.arrojado)}"
        } else if (finalPoints >= 29 ){
            profile_textView.text = "Mediano!! \n${getString(R.string.arrojado)}"
        } else {
            profile_textView.text = "Conservador!! \n${getString(R.string.arrojado)}"

        }
    }
}
