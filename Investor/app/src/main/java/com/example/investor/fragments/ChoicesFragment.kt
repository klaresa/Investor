package com.example.investor.fragments


import com.example.investor.R
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.RadioButton
import android.widget.TextView
import com.example.investor.Questions
import kotlinx.android.synthetic.main.fragment_choices.*


class QuestionFragment : Fragment() {

    lateinit var radioButtonsIds: List<Int>

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {

        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_choices, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        radioButtonsIds = listOf(choice_a_radiobutton.id,
            choice_b_radiobutton.id,
            choice_c_radiobutton.id,
            choice_d_radiobutton.id)
        setUpQuestion()
    }

    fun setUpQuestion(){
        val arguments = arguments
        if (arguments != null){
            question_textview.text = arguments.getString(BODY_KEY)
            val options = arguments.getStringArray(OPTIONS_KEY)
            for (i in options.indices){
                activity?.findViewById<RadioButton>(radioButtonsIds[i])?.text = options[i]
            }
        }


    }

    companion object {
        val BODY_KEY = "body"
        val OPTIONS_KEY = "options"
        val ANSWER_KEY = "answer"

        fun newInstance(question: Questions): QuestionFragment{
            val questionFragment = QuestionFragment()
            questionFragment.arguments = Bundle().apply {
                // salva dados do parâmetro
                putString(BODY_KEY, question.question)
                putStringArray(OPTIONS_KEY, question.choices.toTypedArray())
                putInt(ANSWER_KEY, question.points)
            }

            return questionFragment
        }
    }

}