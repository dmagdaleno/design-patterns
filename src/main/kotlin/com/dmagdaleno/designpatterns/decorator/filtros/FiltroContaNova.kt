package com.dmagdaleno.designpatterns.decorator.filtros

import java.time.LocalDate

class FiltroContaNova(outroFiltro: Filtro? = null) : Filtro(outroFiltro) {

    override fun filtra(contas: List<Conta>): List<Conta> {
        return contas
            .filter { contaAbertaNoMesAtual(it) }
            .plus(aplicaProximoFiltro(contas.filterNot { contaAbertaNoMesAtual(it) }))
    }

    private fun contaAbertaNoMesAtual(it: Conta) =
        it.abertura.month == LocalDate.now().month

}
