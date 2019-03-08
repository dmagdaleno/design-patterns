package com.dmagdaleno.strategy.impostos

interface Imposto {

    fun calcula(orcamento: Orcamento): Double
}