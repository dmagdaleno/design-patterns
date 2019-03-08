package com.dmagdaleno.strategy.impostos

fun main(){
    val orcamento = Orcamento(100.0)

    println("Imposto ISS: ${calcula(orcamento, ISS())}")
    println("Imposto ICMS: ${calcula(
        orcamento,
        ICMS()
    )}")
    println("Imposto ICCC: ${calcula(
        orcamento,
        ICCC()
    )}")

    println("Imposto ICCC(999.99): ${calcula(
        Orcamento(
            999.99
        ), ICCC()
    )}")
    println("Imposto ICCC(1000.0): ${calcula(
        Orcamento(
            1000.0
        ), ICCC()
    )}")
    println("Imposto ICCC(3000.0): ${calcula(
        Orcamento(
            3000.0
        ), ICCC()
    )}")
    println("Imposto ICCC(3001.0): ${calcula(
        Orcamento(
            3001.0
        ), ICCC()
    )}")
}