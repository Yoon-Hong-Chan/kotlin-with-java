package com.lannstark.lec16.kt

import com.lannstark.lec16.Person

class Lec16Main {
    fun aaa(){
        fun bbB(){

        }
    }
}
fun main(){
    val str = "ABC"
    println(str.lastchar())

    val person = Person("HongChan","Yoon",36)
    println(person.nextYearAge())

    println(3 add2 4)
}
fun String.lastchar():Char{
    return this[this.length - 1]
}

fun Person.nextYearAge() : Int{
    return this.age + 1
}

infix fun Int.add2(other:Int): Int{
    return this + other
}

