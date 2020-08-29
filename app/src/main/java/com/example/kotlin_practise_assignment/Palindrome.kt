package com.example.kotlin_practise_assignment

import java.util.*

private var word : String = ""
private var reversedWord : String = ""

fun main(){

    val scanner = Scanner(System.`in`)
    println("Please enter the number")
    word = scanner.next()
    reversedWord  = word.reversed()

    if(word == reversedWord){
        println("You passed")
    }else{
        println("You fail!, Please try with other text...")
    }

}



