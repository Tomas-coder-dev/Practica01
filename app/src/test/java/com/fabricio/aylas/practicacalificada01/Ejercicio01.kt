package com.fabricio.aylas.practicacalificada01

import java.util.Scanner

fun sonAnagramas(palabra1: String, palabra2: String): Boolean {
    // Nos permite verificar la longitud
    if (palabra1.length != palabra2.length) {
        return false
    }

    // Ordena ambas palabras y las compara
    val palabra1Ordenada = palabra1.toCharArray().sorted()
    val palabra2Ordenada = palabra2.toCharArray().sorted()

    return palabra1Ordenada == palabra2Ordenada
}

/
fun main() {
//Scanea y lee las palabras
    val scanner = Scanner(System.`in`)

//Solicitud de palabras :
    println("Ingrese la primera palabra:")
    val palabra1 = scanner.nextLine()

    println("Ingrese la segunda palabra:")
    val palabra2 = scanner.nextLine()

    // Verificacion de las palabras
    if (sonAnagramas(palabra1, palabra2)) {
        println("$palabra1 y $palabra2 son anagramas.")
    } else {
        println("$palabra1 y $palabra2 no son anagramas.")
    }
}
