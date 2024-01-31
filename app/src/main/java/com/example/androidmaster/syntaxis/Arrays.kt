package com.example.androidmaster

fun main(){
      var name: String = "Saharai"
      var name1: String = "Javier"
      var name2: String = "Antonio"
      var name3: String = "Maria"

    //Indice 0- 6
    //Tamaño 7
    var weekDays = arrayOf("Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado", "Domingo")


//    println(weekDays[0])

    //Tamaños
    if (weekDays.size >= 8){
//    println(weekDays[7])
    }
    else{
//        println("No hay mas valores en el array")
    }

    //Modificar valores
    weekDays[0] = "Feliz lunes"
//    println(weekDays[0])

//    println(weekDays.size)

    //Bucles para array
    for (position in weekDays.indices){
//        println(weekDays[position])
    }

    for ((position, value) in weekDays.withIndex()){
//        println("La posicion $position, contiene $value")
    }

    for (weekDay in weekDays){
        println("Ahora es $weekDay")
    }
}

