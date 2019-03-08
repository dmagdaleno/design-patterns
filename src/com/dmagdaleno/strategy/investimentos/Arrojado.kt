package com.dmagdaleno.strategy.investimentos

class Arrojado : Investimento {

    override fun calculaJuros(valor: Double): Double {
        val sorte = (0.. 99).random()
        val juros = decideTipoJuros(sorte)
        return valor * juros
    }

    private fun decideTipoJuros(sorte: Int) =
        when{
            sorte < 20 -> 0.05

            sorte < 50 -> 0.03

            else -> 0.006
        }

}
