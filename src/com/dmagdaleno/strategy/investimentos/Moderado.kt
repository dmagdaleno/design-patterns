package com.dmagdaleno.strategy.investimentos

class Moderado: Investimento {

    override fun calculaJuros(valor: Double): Double {
        val sorte = (0.. 1).random()
        val juros = decideTipoJuros(sorte)
        return valor * juros
    }

    private fun decideTipoJuros(sorte: Int) = if (sorte == 1) 0.025 else 0.007
}