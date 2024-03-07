package com.example.taskcal01

fun main(){
    var firstMain : Int = 0
    var operSym : Int
    var secondMain : Int
    var result : Any
    var firstTrial = Calculator()

    println("첫 번째 숫자를 입력하세요")
    firstMain = readLine()!!.toInt()

    while(firstMain!=-1){

        println("연산자를 선택하세요. [1 = +, 2 = -, 3 = *, 4 = /, 5 = % ]")
        operSym = readLine()!!.toInt()

        println("두 번째 숫자를 입력하세요")
        secondMain = readLine()!!.toInt()


        result = firstTrial.returnResult(firstMain, operSym, secondMain)
        println(result)
        println("")

        println("첫 번째 숫자를 입력하세요")
        firstMain = readLine()!!.toInt()

    }
    println("-1 입력, 계산기 종료")


}