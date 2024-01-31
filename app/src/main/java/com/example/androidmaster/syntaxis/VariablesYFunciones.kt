package com.example.androidmaster


val age: Int = 20


fun main() {
    showMyName()
    showMyAge(27)
    add(25,76)
    val mySubtract = substract(10, 5)
    println(mySubtract)
}

fun showMyName(){
    println("Me llamo Saharai")
}

fun showMyAge(currentAge:Int){
    println("Tengo $currentAge años")
}

fun add(firstNumber: Int, secondNumber: Int){
    print(firstNumber + secondNumber)
}

fun substract(firstNumber: Int, secondNumber: Int):Int{
     return firstNumber- secondNumber
 }

fun varianleAlfanumericas(){
    /**Variables Alfanumericas **/

    //Char
    val charExample: Char = 'e'
    val charExample2: Char = '2'
    val charExample3: Char = '@'

    //String
    val stringExample: String = "Saharai"
    val stringExample2: String = "27"
    val stringExample3: String = "A+"
    val stringExample4: String = "Esquivel"

    var stringConcatenada: String = "Hola"
    stringConcatenada =
        "hola me llamo $stringExample $stringExample4 & tengo $stringExample2 años y " +
                "mi tipo de sangre es $stringExample3 pero no tengo $age años"
    println(stringConcatenada)

    val example123: String = age.toString()
}

fun variableBoolean(){
    /**Variables Booleanas **/

    //Boolean
    val booleanExample: Boolean = true
    val booleanExample2: Boolean = false
    val booleanExample3: Boolean = false
}

fun variableNumericas(){

    /**Variables númericas **/
    //Int -2,147, 483,647 a 2147,483,647
    val age: Int = 20
    var age2 = 20

    //Long -9223,372,036,854,775,807 a
    val example: Long = 30

    //float
    val floatExample: Float = 30.5f

    //Double
    val doubleExample: Double = 3241.31258



    println("Sumar:")
    println(age + age2)

    println("Restar:")
    println(age - age2)

    println("Multuplicar:")
    println(age * age2)

    println("Divicion:")
    println(age / age2)

    println("Modulo:")
    println(age % age2)

 var exampleSuma: Float = age + floatExample
}
