package com.example.taskcal01

fun main(){
    var userInput : String?
    var prevResult : Double = 0.0
    var result : Double
    var firstNum : Double = 0.0
    var operSym : Char = 'a'
    var secondNum : Double = 0.0
    var checkOrder = false

    while(true){
        try {
            userInput = readLine()

            if(userInput=="-1") {
                //종료하기?
                break
            }
            if(userInput?.first()!=null){
                for(i in userInput) {
                    if(i!='+' && i != '-' && i != '*' && i != '/' && i != '%'){
                        if(!checkOrder) {
                            firstNum = firstNum*10 + i.toString().toInt()
                        } else {
                            secondNum = secondNum*10 + i.toString().toInt()
                        }
                    }
                    else{
                        checkOrder = true
                        operSym = i
                    }
                }
                var firstTry = Calculator()
                result = firstTry.returnResult(firstNum,operSym,secondNum)
                println(result)
                prevResult = result
                firstNum = 0.0
                secondNum = 0.0

            } //else {
                //
            //}

        } catch(e:Exception){
            println("다시 입력하기")
            continue
        }
    }



        }


    //종료?

