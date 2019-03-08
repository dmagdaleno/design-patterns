package com.dmagdaleno.strategy

fun calcula(orcamento: Orcamento, estrategia: Imposto): Double = estrategia.calcula(orcamento)