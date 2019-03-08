package com.dmagdaleno.strategy.impostos

class ISS: Imposto {

    override fun calcula(orcamento: Orcamento): Double {
        return orcamento.valor * 0.06
    }
}