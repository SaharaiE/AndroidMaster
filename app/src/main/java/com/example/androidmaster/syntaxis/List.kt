package com.example.androidmaster

fun main(){
    //inmutableList()
mutableList()
}

fun mutableList(){
    var weekDays: MutableList<String> = mutableListOf("lunes", "martes", "miercoles", "jueves", "viernes", "sabado","domingo")
    weekDays.add("Saharai")

    println(weekDays)

    if(weekDays.isEmpty()){
        //No voy a pintar nada porque no hay
    }else{
        weekDays.forEach{ println(it) }
    }

    if (weekDays.isNotEmpty()){
        weekDays.forEach{ println(it) }
    }

    weekDays.last()
}

fun inmutableList() {

    //Lista de lectura inmutada
    val readOnly: List<String> =
        listOf("lunes", "martes", "miercoles", "jueves", "viernes", "sabado", "domingo")

    println(readOnly.size)
    println(readOnly)
    println(readOnly[0])
    println(readOnly.last())
    println(readOnly.first())


//    Filtrar
    val example = readOnly.filter { it.contains("a") }
    println(example)

    //Iterar
    readOnly.forEach{ weekDay -> println(weekDay) }
}