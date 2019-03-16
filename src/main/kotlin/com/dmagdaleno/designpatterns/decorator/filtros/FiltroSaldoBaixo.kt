package com.dmagdaleno.designpatterns.decorator.filtros

class FiltroSaldoBaixo(outroFiltro: Filtro? = null) : Filtro(outroFiltro) {

    override fun filtra(contas: List<Conta>): List<Conta> {
        return contas.filter { it.saldo < 100 }.plus(aplicaProximoFiltro(contas.filterNot{ it.saldo < 100 }))
    }

}
