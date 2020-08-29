package com.example.kotlin_practise_assignment

import java.util.*

fun main(){

    val scanner = Scanner(System.`in`)
    println("Please input data")
    val input : String = scanner.next()
    val characterList : CharArray = input.toCharArray()

    for(i in characterList){
        when(i) {
            '[',']','{','}','(',')' -> {
                balanced(characterList)
            }
            else -> {
                println("Fail. Input must be [ or { or (")
            }
        }
    }

}

fun balanced(characterList : CharArray){
    val list : CharArray = characterList
    var count01 : Int = 0
    var count02 : Int = 0
    var count03 : Int = 0

    for(i in list){
        if(i == '[' || i == ']'){
            count01++
        }else if (i == '{' || i == '}'){
            count02++
        }else if (i == '(' || i == ')'){
            count03++
        }
    }
    if (count01 == count02 && count01 == count03 && count02 == count03){
        println("It’s balanced. pair of { = $count02 , pair of [ = $count01 , pair of ( = $count03")
    }else{
        println("It's not balanced")
    }
}