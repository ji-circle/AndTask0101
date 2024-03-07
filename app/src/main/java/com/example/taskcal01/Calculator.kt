package com.example.taskcal01

open class Calculator {
    lateinit var classCal : Any
    open fun returnResult(firstNum:Int, operSym:Int, secondNum:Int): Any {
        when (operSym) {
            1 -> {
                classCal = AddOperation(firstNum, secondNum).calculateNow()
                //return firstNum+secondNum
            }

            2 -> {
                classCal = SubtractOperation(firstNum, secondNum).calculateNow()
                //return firstNum - secondNum
            }

            3 -> {
                classCal = MultiplyOperation(firstNum, secondNum).calculateNow()
                //return firstNum * secondNum
            }

            4 -> {
                classCal = DivideOperation(firstNum, secondNum).calculateNow()
                //return firstNum / secondNum
            }

            5 -> { //%
                return firstNum % secondNum
            }

            else -> {
                return "연산자 입력 오류"
            }
        }
        return print(classCal)
    }

}