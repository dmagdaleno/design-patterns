package com.dmagdaleno.designpatterns.strategy.investimentos

fun calculaJurosComImposto(valor: Double, estrategia: Investimento) = 0.75 * estrategia.calculaJuros(valor)