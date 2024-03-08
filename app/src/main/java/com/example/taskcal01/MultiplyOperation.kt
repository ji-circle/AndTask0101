package com.example.taskcal01

class MultiplyOperation(firstNum: Int, secondNum: Int) : AbstractOperation(firstNum, secondNum){

//    override fun calculateNow() : Int {
//        var result = addFirst * addSecond
//        return result
//    }
    override fun calculateNow() : Int = addFirst * addSecond
}