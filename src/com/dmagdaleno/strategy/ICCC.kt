package com.dmagdaleno.strategy

class ICCC: Imposto {

    override fun calcula(orcamento: Orcamento): Double {
        return when {
            orcamento.valor < 1000 -> {
                orcamento.valor * 0.05
            }

            orcamento.valor > 3000 -> {
                orcamento.valor * 0.08 + 30
            }

            else -> {
                orcamento.valor * 0.07
            }
        }
    }
}