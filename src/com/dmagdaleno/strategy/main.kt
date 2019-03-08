package com.dmagdaleno.strategy

fun main(){
    val iss = ISS()
    val icms = ICMS()

    val orcamento = Orcamento(100.0)

    println("Imposto ISS: ${calcula(orcamento, iss)}")
    println("Imposto ICMS: ${calcula(orcamento, icms)}")
}