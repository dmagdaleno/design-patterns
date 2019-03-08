package com.dmagdaleno.strategy.investimentos

fun calculaJurosComImposto(valor: Double, estrategia: Investimento) = 0.75 * estrategia.calculaJuros(valor)