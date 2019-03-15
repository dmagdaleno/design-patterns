package com.dmagdaleno.designpatterns.templatemethod.impostos

fun calcula(orcamento: Orcamento, estrategia: Imposto): Double = estrategia.calcula(orcamento)