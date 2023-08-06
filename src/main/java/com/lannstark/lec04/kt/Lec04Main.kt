package com.lannstark.lec04.kt

import com.lannstark.lec04.JavaMoney

fun main(){
    val money1 = JavaMoney(2_000L)
    val money2 = JavaMoney(1_000L)
    val money3 = money2
    val money4 = JavaMoney(1_000L)

    if(money1 > money2){
        println("Money1이 Money2보다 금액이 큽니다")
    }

    println(money3 === money2)
    println(money3 === money4)
    println(money3 == money4)



}