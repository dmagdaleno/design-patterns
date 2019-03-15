package com.dmagdaleno.designpatterns.strategy.investimentos

fun main() {
    val valor = 100.0

    println("Juros (Conservador): ${calculaJurosComImposto(valor, Conservador())}")

    println("Juros (Moderado): ${calculaJurosComImposto(valor, Moderado())}")

    println("Juros (Arrojado): ${calculaJurosComImposto(valor, Arrojado())}")

}