package com.dmagdaleno.designpatterns.decorator.impostos

class ICMS(outroImposto: Imposto? = null): Imposto(outroImposto) {

    override fun calcula(orcamento: Orcamento): Double {
        return orcamento.valor * 0.05 + 50 + calculaOutroImposto(orcamento)
    }
}