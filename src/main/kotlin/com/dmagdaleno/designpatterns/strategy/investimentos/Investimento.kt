package com.dmagdaleno.designpatterns.strategy.investimentos

interface Investimento {
    fun calculaJuros(valor: Double): Double
}