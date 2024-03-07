package com.example.taskcal01

abstract class AbstractOperation(firstNum: Int, secondNum: Int) {
    var addFirst = firstNum
    var addSecond = secondNum
    abstract fun calculateNow():Any

}