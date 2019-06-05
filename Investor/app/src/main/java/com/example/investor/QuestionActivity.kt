package com.example.investor

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.RadioButton
import android.widget.RadioGroup
import com.example.investor.fragments.QuestionFragment
import kotlinx.android.synthetic.main.activity_question.*

class QuestionActivity : AppCompatActivity() {

    val TAG = "QuestionActivity"
    lateinit var questions: List<Questions>
    var currentQuestionIndex = 0

    var totalPoints = 0



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_question)

        var yourName = intent.getStringExtra("yourName")
        textView_userName.text = "${yourName}:"

        val optionsArray = resources.getStringArray(R.array.um_alt)

        //questions =

        // para operar com fragments
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
            val selectedRadioButton = findViewById<RadioButton>(selectedOptionId)

            sumUp()

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
            startActivity(intent)
        }
    }

    fun sumUp(){
    }

}
