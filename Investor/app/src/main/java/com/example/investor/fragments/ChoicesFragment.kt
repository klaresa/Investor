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

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_choices, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        var counter = 0


        radioButtonsIds = listOf(
            choice_a_radiobutton.id,
            choice_b_radiobutton.id,
            choice_c_radiobutton.id,
            choice_d_radiobutton.id
        )
        setUpQuestion()
    }

    fun setUpQuestion() {
        val arguments = arguments
        if (arguments != null) {
            question_textview.text = arguments.getString(TITLE_KEY)
            val answers = arguments.getStringArray(ANSWERS_KEY)

            for (item in answers.indices) {
                activity?.findViewById<RadioButton>(radioButtonsIds[item])?.text = answers[item]
            }
        }
    }

    companion object {
        val TITLE_KEY = "title"
        val ANSWERS_KEY = "answers"
        val POINTS_KEY = "points"

        fun newInstance(question: Questions): QuestionFragment {
            val questionFragment = QuestionFragment()
            questionFragment.arguments = Bundle().apply {

                putString(TITLE_KEY, question.question)
                putStringArray(ANSWERS_KEY, question.choices.toTypedArray())
                putIntArray(POINTS_KEY, question.points.toIntArray())
            }

            return questionFragment
        }
    }

}