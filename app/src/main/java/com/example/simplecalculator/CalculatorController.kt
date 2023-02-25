package com.example.simplecalculator

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class CalculatorController : AppCompatActivity() {
    private var deci: Boolean = false
    private var oper: Boolean = false
    private lateinit var model: CalculatorModel
    private lateinit var working: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_calculator_controller)
        model = CalculatorModel()
        working = findViewById(R.id.result_textview)
    }

    fun onDigitPressed(view: View?) {
        if (view is Button) {
            model.stringCreation(view.text as String)
            working.append(view.text)
            oper = false
        }
    }

    fun onOperatorPressed(view: View?) {
        if (!oper) {
            if (view is Button) {
                model.stringCreation(view.text as String)
                working.append(view.text)
            }
            oper = true
            deci = false
        }

    }

    fun onDecimalPressed(view: View?) {
        if (!deci) {
            if (view is Button) {
                model.stringCreation(view.text as String)
                working.append(view.text)
            }
            deci = true
        }

    }


    fun onClearPressed(view: View?) {
        if (view is Button) {
            model.clear()
            working.text = ""
            deci = false
            oper = false
        }
//        view.setDisplay("0")
    }


    fun onEqualsPressed(view: View) {
        if (view is Button) {
            val result = model.calculate()
            working.text = result.toString()
        }
    }
}