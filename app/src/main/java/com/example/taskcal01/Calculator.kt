package com.example.taskcal01

open class Calculator {
    lateinit var classCal : Any
    open fun returnResult(firstNum:Int, operSym:Int, secondNum:Int): Any {
        when (operSym) {
            1 -> {
                classCal = AddOperation(firstNum, secondNum).calculateNow()
            }

            2 -> {
                classCal = SubtractOperation(firstNum, secondNum).calculateNow()
            }

            3 -> {
                classCal = MultiplyOperation(firstNum, secondNum).calculateNow()
            }

            4 -> {
                classCal = DivideOperation(firstNum, secondNum).calculateNow()
            }

            5 -> { //%
                classCal = firstNum % secondNum
            }

            else -> {
                return "연산자 입력 오류"
            }
        }
        return println("$classCal")
    }

}