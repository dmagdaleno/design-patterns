package com.dmagdaleno.designpatterns.decorator.impostos

class ImpostoMuitoAlto(outroImposto: Imposto? = null): Imposto(outroImposto) {

    override fun calcula(orcamento: Orcamento): Double {
        return orcamento.valor * 0.2 + calculaOutroImposto(orcamento)
    }
}