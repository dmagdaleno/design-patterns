package com.dmagdaleno.designpatterns.strategy.impostos

class ICMS: Imposto {

    override fun calcula(orcamento: Orcamento): Double {
        return orcamento.valor * 0.05 + 50
    }
}