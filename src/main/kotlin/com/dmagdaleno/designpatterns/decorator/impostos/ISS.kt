package com.dmagdaleno.designpatterns.decorator.impostos

class ISS(outroImposto: Imposto? = null): Imposto(outroImposto) {

    override fun calcula(orcamento: Orcamento): Double {
        return orcamento.valor * 0.06 + calculaOutroImposto(orcamento)
    }
}