package com.dmagdaleno.designpatterns.strategy.impostos

fun calcula(orcamento: Orcamento, estrategia: Imposto): Double = estrategia.calcula(orcamento)