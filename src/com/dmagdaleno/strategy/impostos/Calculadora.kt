package com.dmagdaleno.strategy.impostos

fun calcula(orcamento: Orcamento, estrategia: Imposto): Double = estrategia.calcula(orcamento)