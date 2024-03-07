package com.example.taskcal01

class DivideOperation(firstNum: Int, secondNum: Int) : AbstractOperation(firstNum, secondNum){

    override fun calculateNow() : Int {
        var result = addFirst / addSecond
        return result
    }
}