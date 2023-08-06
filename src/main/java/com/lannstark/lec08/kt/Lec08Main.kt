package com.lannstark.lec08.kt
fun main(){
    repeat("hello", useNewLine = false)
    val array = arrayOf("A","B","C")
    printAll(*array)
}
fun max(a: Int, b: Int) = if(a > b) a else b

fun repeat(
    str: String,
    num: Int = 3,
    useNewLine: Boolean = true
){
    for (i in 1..num){
        if(useNewLine)
            println(str)
        else
            print(str)
    }
}

fun printAll(vararg strings: String){
    for(str in strings){
        println(str)
    }
}