package com.lannstark.lec13.kt


fun main(){

}

class House(private var address:String){
    private var livingRoom: LivingRoom = LivingRoom(10.0);


    inner class LivingRoom(private val area: Double) {
        val address:String
            get()=this@House.address
    }

}