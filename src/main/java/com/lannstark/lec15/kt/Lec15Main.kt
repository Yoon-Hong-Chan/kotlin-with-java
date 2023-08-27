package com.lannstark.lec15.kt

fun main(){
    val array = arrayOf(100,200)
    for(i in array.indices){
        println("$i ${array[i]}")
    }

    for((index,value) in array.withIndex()){
        println("$index $value")
    }

    val numbers = mutableListOf(100,200)
    val emptyList = emptyList<Int>()

    for(i in numbers.indices){
        println("$i ${numbers[i]}")
    }

    for((index,value) in numbers.withIndex()){
        println("$index $value")
    }

    val numberSet = setOf(100,200)

    for(i in numberSet.indices){
        println("$i ${numberSet.elementAt(i)}")
    }

    for((index,value) in numberSet.withIndex()){
        println("$index $value")
    }

    val numberMap = mutableMapOf<String,String>()
    numberMap["aaa"] = "bb bb"
    for(key in numberMap.keys){
        println("$key ${numberMap[key]}")
    }

}