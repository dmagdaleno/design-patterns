package com.dmagdaleno.designpatterns.strategy.impostos

interface Imposto {

    fun calcula(orcamento: Orcamento): Double
}