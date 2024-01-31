package com.example.androidmaster


/**Por lo general, el telefono te proporciona un resumen de las notificaciones
 * En el código inicial que se proporciona en el siguiente fragmento de codigo
 * escribe un programa que imprima el mensaje de resumen segun la cantidad de
 * notificaciones que recibiste. El mensaje debe incluir lo siguiente:
 *
 *                              RESULTADO
 * 1- La cantidad exacta de notificaciones cuando haya menos de 100
 * 2- 99+ como cantidad de notificaciones cuando haya 100 o más                **/

fun main(){
    val morningNotification = 51
    val eveningNotification = 135

    printNotificationSummary(morningNotification)
    printNotificationSummary(eveningNotification)
}

fun printNotificationSummary(numberOfMessages: Int){
    //Completar codigo
    if(numberOfMessages >= 100){
        println("99+ como cantidad de notificaciones cuando haya 100 o más")
    }
    else{
        println("Tu tienes $numberOfMessages notificaciones")
    }

}
