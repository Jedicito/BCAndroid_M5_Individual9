package chl.ancud.m5_individual9

fun main(){
    print("Ingrese en Celsius: ")
    val ingreso = readLine()!!.toDouble()

    val fahrenheit = ingreso * 9.0/5.0 + 32

    println("Fahrenheit: $fahrenheit")

    val kelvin = ingreso + 273.15
    println("Kelvin: $kelvin")
}

fun sonLetras(cadena: String): Boolean {
    return cadena.none {it !in 'A'..'Z' && it !in 'a'..'z'}
}