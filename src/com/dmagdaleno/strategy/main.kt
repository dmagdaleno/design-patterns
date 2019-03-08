package com.dmagdaleno.strategy

fun main(){
    val orcamento = Orcamento(100.0)

    println("Imposto ISS: ${calcula(orcamento, ISS())}")
    println("Imposto ICMS: ${calcula(orcamento, ICMS())}")
}