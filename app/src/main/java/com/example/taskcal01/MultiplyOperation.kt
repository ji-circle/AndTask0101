package com.example.taskcal01

class MultiplyOperation(firstNum: Int, secondNum: Int) : AbstractOperation(firstNum, secondNum){

    override fun calculateNow() : Any {
        var result = addFirst * addSecond
        return result
    }

}