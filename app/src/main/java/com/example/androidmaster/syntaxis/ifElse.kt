package com.example.androidmaster
// Or (||) se cumple uno o el otro
//y (&&) se tiene que cumplir todo

fun main(){
   // ifBasico()
   // ifAnidado()
   // ifBoolean()
   // ifInt()
}

fun ifMultipleOr(){
    var pet = "dog"

    if(pet == "cat" || pet == "dog"){
        print("Es un gato o es un perro")
    }

    if(pet == "dog"){
        print("Es un gato o es un perro")
    }
}

fun ifMultiple(){
    var age = 18
    var parentPermission = false
    var imHappy = true

    if(age >= 18 && parentPermission && imHappy) {
        println("Puedo beber cerveza")

    }
}

fun ifInt(){
    var age = 27

    if(age >= 18){
        println("Beber cerveza")
    }else{
        println("Beber jugo")
    }
}

fun ifBoolean(){
    var soyFeliz: Boolean = false

    //Sin nada == true
    //con ! al principio == false

    if (!soyFeliz){
        println("Estoy triste :c")
    }
}

fun ifAnidado(){
    val animal = "cat"

    if(animal == "cat"){
        println("Es un gato!")
    }
    else if(animal == "dog"){
        println("Es un dog")
    }
    else if(animal == "bird"){
        println("es un pajaro")
    }
    else{
        println("No es de los animales esperados")
    }

}
fun ifBasico(){
    val name = "Saharai"


    if(name.lowercase() == "SAHARAI"){
        println("Oye, la variable name es Saharai")
    }else{
        println("Este no es Saharai")
    }

}