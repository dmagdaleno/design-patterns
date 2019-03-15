package com.dmagdaleno.designpatterns.strategy.investimentos

class Conservador: Investimento {

    override fun calculaJuros(valor: Double): Double {
        return valor * 0.008
    }
}