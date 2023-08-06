package com.lannstark.lec05.kt

fun main(){

}

fun getPassOrFail(score: Int):String{
    return if(score >= 50){
        "P"
    }else{
        "F"
    }
}

fun validateScoreIsNotNegative(score : Int){
    if(score < 0){
        throw IllegalArgumentException("${score}는 0보다 작을 수 없음")
    }
}

fun validate(score: Int){
    if(score !in 0..100){
        throw IllegalArgumentException("${score}는 범위를 넘어설 수 없음")
    }
}

fun startsWithA(obj : Any): Boolean{
//    return if(obj is String){
//        obj.startsWith("A")
//    }else{
//        false
//    }
    return when(obj){
        is String -> obj.startsWith("A")
        else -> false
    }
}

fun judgeNumber(number : Int){
    when(number){
        1,0,-1 -> println("어디서 많이 본 숫자입니다")
        else -> println("1, 0, -1이 입니다")
    }
}