package com.example.investor

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.RadioButton
import android.widget.RadioGroup
import com.example.investor.fragments.QuestionFragment
import kotlinx.android.synthetic.main.activity_question.*
import kotlinx.android.synthetic.main.fragment_choices.*
import java.util.ArrayList
import kotlin.math.absoluteValue

class QuestionActivity : AppCompatActivity() {

    lateinit var questions: List<Questions>
    var currentQuestionIndex = 0

    var placar = 0
    var finalPoints = 0



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_question)

        var yourName = intent.getStringExtra("yourName")
        textView_userName.text = "${yourName}:"

        questions = listOf(
            Questions(getString(R.string.um), resources.getStringArray(R.array.um_alt).toList(), listOf(0, 2, 3, 4)),
            Questions(getString(R.string.dois), resources.getStringArray(R.array.dois_alt).toList(), listOf(0, 2, 3, 4)),
            Questions(getString(R.string.tres), resources.getStringArray(R.array.tres_alt).toList(), listOf(0, 2, 3, 4)),
            Questions(getString(R.string.quatro), resources.getStringArray(R.array.quatro_alt).toList(), listOf(0, 2, 4, 0)),
            Questions(getString(R.string.cinco), resources.getStringArray(R.array.cinco_alt).toList(), listOf(0, 2, 4, 0)),
            Questions(getString(R.string.seis), resources.getStringArray(R.array.seis_alt).toList(), listOf(0, 2, 3, 4)),
            Questions(getString(R.string.sete), resources.getStringArray(R.array.sete_alt).toList(), listOf(0, 2, 3, 4)),
            Questions(getString(R.string.oito), resources.getStringArray(R.array.oito_alt).toList(), listOf(0, 2, 3, 4)),
            Questions(getString(R.string.nove), resources.getStringArray(R.array.nove_alt).toList(), listOf(0, 2, 3, 4))

        )

        val fragmentTransaction = supportFragmentManager.beginTransaction()
        val questionFragment = QuestionFragment.newInstance(questions[currentQuestionIndex])
        fragmentTransaction.add(R.id.container, questionFragment)
        fragmentTransaction.commit()

        setUpListeners()

    }

    fun setUpListeners(){

        button_next.setOnClickListener {

            val choicesRadioGroup = findViewById<RadioGroup>(R.id.choices_radiogroup)
            val selectedOptionId = choicesRadioGroup.checkedRadioButtonId

            points(selectedOptionId)
            sumUp(placar)

            // chama
            showNextQuestion()

        }
    }

    // funcao para mostrar a proxima funcao
    fun showNextQuestion(){
        currentQuestionIndex += 1
        // se ainda houver perguntas
        if (currentQuestionIndex < questions.size){
            // instancia o manager
            val fragmentTransaction = supportFragmentManager.beginTransaction()
            val questionFragment = QuestionFragment.newInstance(questions[currentQuestionIndex])
            // troca o fragmento
            fragmentTransaction.replace(R.id.container, questionFragment)
            fragmentTransaction.commit()
        } else {
            // abre a activity final com o nome e resultados
            var yourFinal = textView_userName.text.toString()
            var intent = Intent(this, FinalActivity::class.java)
            intent.putExtra("yourFinal", yourFinal)
            intent.putExtra("finalPoints", finalPoints)
            startActivity(intent)
        }
    }

    fun points(id:Int):Int{
        var kjjhj = when (id){
            R.id.choice_a_radiobutton -> questions[currentQuestionIndex].points[0]
            R.id.choice_b_radiobutton -> questions[currentQuestionIndex].points[1]
            R.id.choice_c_radiobutton -> questions[currentQuestionIndex].points[2]
            R.id.choice_d_radiobutton -> questions[currentQuestionIndex].points[3]
            else -> 0
        }
        placar = kjjhj
        return placar
    }

    fun sumUp(points:Int):Int{

        finalPoints += points
        return finalPoints
    }
}
