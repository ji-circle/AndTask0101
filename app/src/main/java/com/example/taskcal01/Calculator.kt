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

    fun returnResult(firstNum:Int, operSym:Int, secondNum:Int): Any {
        when(operSym){
            1 -> {
                return firstNum+secondNum
            }
            2 -> {
                return firstNum-secondNum
            }
            3 -> {
                return firstNum * secondNum
            }
            4 -> {
                return firstNum / secondNum
            }
            5 -> { //%
                return firstNum % secondNum
            }
            else -> {
                return "연산자 입력 오류"
            }
    }


    }


}