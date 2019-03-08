package com.dmagdaleno.strategy.investimentos

interface Investimento {
    fun calculaJuros(valor: Double): Double
}