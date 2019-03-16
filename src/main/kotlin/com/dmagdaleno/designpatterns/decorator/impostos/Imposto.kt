package com.dmagdaleno.designpatterns.decorator.impostos

abstract class Imposto(protected val outroImposto: Imposto? = null) {

    abstract fun calcula(orcamento: Orcamento): Double

    protected fun calculaOutroImposto(orcamento: Orcamento): Double {
        val imposto = outroImposto ?: return 0.0
        return imposto.calcula(orcamento)
    }
}