package com.example.androidmaster

fun main(){
      //getMonth(3)

}

fun result(value:Any){
    when(value){
        is Int -> value + value
        is String -> println(value)
        is Boolean -> if(value) print("Hola")
    }
}

//fun getSemester(month: Int):String {
//    when (month) {
////        in 1..6 ->println("primer semestre")
////        in 7..12 ->println("segundo semestre")
////        !in 1..12 ->println("segundo semestre")
//
//        1, 2, 3, 4, 5, 6 -> println("primer semestre")
//        7, 8, 9, 10, 11, 12 -> println("segundo semestre")
//        else -> "snow"
//    }
//}
//fun getTrimester(month: Int) {
//    when (month) {
//        1, 2, 3 -> println("primer trimestre")
//        4, 5, 6 -> println("segundo trimestre")
//        7,8, 9 -> println("tercer trimestre")
//        10, 11, 12 -> println("cuarto trimestre")
//
//        else -> println("Trimestre no valido")
//    }
//}
//

//fun getMonth(month:Int) {
//    when (month) {
//        1 -> println("Enero")
//        2 -> println("Febrero")
//        3 -> println("Marzo")
//        4 -> println("Abril")
//        5 -> println("Mayo")
//        6 -> println("Junio")
//        7 -> println("Julio")
//        8 -> println("Agosto")
//        9 -> println("Septiembre")
//        10 -> println("Octubre")
//        11 -> {
//            println("Noviembre")
//            println("Noviembre")
//        }
//        12 -> println("Diciembre")
//        else -> println("No es valido")
//    }
//
//}
//    if(month ==1){
//        println("Enero")
//    }else if(month == 2){
//        println("Febrero")
//    }else if(month == 3){
//        println("Marzo")
//    }else if(month == 4){
//        println("Abril")
//    }else if(month == 5){
//        println("Mayo")
//    }else if(month == 6){
//        println("Junio")
//    }else if(month == 7){
//        println("Julio")
//    }else if(month == 8){
//        println("Agosto")
//    }else if(month == 9){
//        println("Septiembre")
//    }else if(month == 10){
//        println("Octubre")
//    }else if(month == 11){
//        println("Noviembre")
//    }else if(month == 12){
//        println("Diciembre")
//    }
//    else{
//        println("El mes no existe")
//    }

