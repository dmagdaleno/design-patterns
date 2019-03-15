package com.dmagdaleno.designpatterns.templatemethod.impostos

class ICCC: Imposto {

    override fun calcula(orcamento: Orcamento): Double {
        return when {
            orcamento.valorTotal < 1000 -> {
                orcamento.valorTotal * 0.05
            }

            orcamento.valorTotal > 3000 -> {
                orcamento.valorTotal * 0.08 + 30
            }

            else -> {
                orcamento.valorTotal * 0.07
            }
        }
    }
}