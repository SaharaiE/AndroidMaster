package com.example.androidmaster.excersice

/**Las entradas de cine suelen tener un precio diferente segun la edad de los espectadores
 * En el codigo inicial que se proporciona en el siguiente fragmento de codigo, escribe un programa que
 * calcule los precios de estas entradas basados en la edad:
 *
 * 1- Un precio de entrada infantil de USD 15 para personas de 12 años o menos
 * 2-Un precio de entrada estandar de USD 30 para personas de entre 13 y 60 personas que calcule los precios
 * con descuento de USD 25 para el mismo grupo etario
 * 3- Un precio para adultos mayores de USD 20 para personas de 61 años o mas (asumimos que la edad maxima
 * de un espectador es de 100 años)
 * 4- Un valor -1 para indicar que el precio no es valido cuando un usuario ingresa una edad fuera de las
 * especificaciones **/

fun main(){
    val child = 5
    val adult = 28
    val senior = 81

    val isMonday = true

    println("El precio de la pelicula para $child es \$${ticketPrice(child,isMonday)}")
    println("El precio de la pelicula para $adult es \$${ticketPrice(adult, isMonday)}")
    println("El precio de la pelicula para $senior es \$${ticketPrice(senior, isMonday)}")
}


fun ticketPrice(age: Int, isMonday: Boolean): Int{
    return when(age){
        in 0..12   -> 15
        in 13..60  -> if(isMonday) 25 else 30
        in 61..100 -> 20
        else -> -1
    }
}