package com.dmagdaleno.designpatterns.templatemethod.impostos

class ICMS: Imposto {

    override fun calcula(orcamento: Orcamento): Double {
        return orcamento.valorTotal * 0.05 + 50
    }
}