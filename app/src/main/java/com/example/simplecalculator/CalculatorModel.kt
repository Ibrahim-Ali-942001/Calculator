package com.example.simplecalculator

import net.objecthunter.exp4j.ExpressionBuilder


class CalculatorModel {
    private var deci:Boolean=false
    private var oper:Boolean=false
    private var calculationString:String="0"

    fun stringCreation(character:String)
    {
        if (character!="/" && character!="*" && character!="-" && character!="+" )
        {
            oper=false
            if (character==".") {
                if(!deci)
                {
                    calculationString += character
                    deci=true
                }
            }
            else if (calculationString=="0"){
                calculationString=character
            }
            else
            {
                calculationString += character
            }
        }
        else
        {
            deci=false

            if(!oper)
            {
                if(calculationString.endsWith("."))
                {
                    calculationString+= "0$character"
                }
                else{
                    calculationString+=character
                }
                oper=true
            }

        }
    }


    fun calculate(): Double {
        var expression = ExpressionBuilder(calculationString).build()
        var result=expression.evaluate()
        calculationString=result.toString()
        return result
    }

    fun clear()
    {
        calculationString="0"
        oper=false
        deci=false
    }
}