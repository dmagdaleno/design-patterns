package com.dmagdaleno.designpatterns.templatemethod.impostos

class ISS: Imposto {

    override fun calcula(orcamento: Orcamento): Double {
        return orcamento.valorTotal * 0.06
    }
}