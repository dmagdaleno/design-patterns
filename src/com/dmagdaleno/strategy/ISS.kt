package com.dmagdaleno.strategy

class ISS: Imposto {

    override fun calcula(orcamento: Orcamento): Double {
        return orcamento.valor * 0.06
    }
}