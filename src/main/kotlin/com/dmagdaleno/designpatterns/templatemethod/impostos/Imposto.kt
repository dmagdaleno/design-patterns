package com.dmagdaleno.designpatterns.templatemethod.impostos

interface Imposto {

    fun calcula(orcamento: Orcamento): Double
}