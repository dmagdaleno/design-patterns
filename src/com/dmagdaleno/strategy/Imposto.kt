package com.dmagdaleno.strategy

interface Imposto {

    fun calcula(orcamento: Orcamento): Double
}