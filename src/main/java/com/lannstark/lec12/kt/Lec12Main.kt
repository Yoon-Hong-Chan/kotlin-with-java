package com.lannstark.lec12.kt

import com.lannstark.lec12.Movable
import java.lang.System.Logger
import java.util.*

fun main(){
    Singletone.a
    Singletone.asdasd()

    moveSomething(object : Movable {
        override fun move() {
            println("무브 무브")
        }

        override fun fly() {
            println("날다 날다")
        }

    })
}

class Person private constructor(var name: String, var age: Int){

    companion object Factory{
        private const val MIN_AGE:Int = 1

        @JvmStatic
        fun newBaby(name: String)=Person(name, MIN_AGE)
    }
}

private fun moveSomething(movable: Movable){
    movable.move()
    movable.fly()
}
object Singletone {
    var a: Int = 0
    fun asdasd(){

    }
}