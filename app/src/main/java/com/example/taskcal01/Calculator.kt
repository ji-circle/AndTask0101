package com.example.taskcal01

class Calculator {
//    var firstNum: Double
//    var operSym: Char
//    var secondNum: Double
//
//    constructor(_firstNum:Double, _operSym:Char, _secondNum:Double){
//        firstNum = _firstNum
//        operSym = _operSym
//        secondNum = _secondNum
//    }

    fun returnResult(firstNum:Double, operSym:Char, secondNum:Double): Double {
        return when(operSym){
            '+' -> {
                return firstNum+secondNum
            }
            '-' -> {
                return firstNum-secondNum
            }
            '*' -> {
                return firstNum * secondNum
            }
            '/' -> {
                return firstNum / secondNum
            }
            else -> { //%
                return firstNum % secondNum
            }
    }


    }


}