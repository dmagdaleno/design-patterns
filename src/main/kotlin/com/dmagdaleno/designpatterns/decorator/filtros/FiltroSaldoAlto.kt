package com.dmagdaleno.designpatterns.decorator.filtros

class FiltroSaldoAlto(outroFiltro: Filtro? = null) : Filtro(outroFiltro) {

    override fun filtra(contas: List<Conta>): List<Conta> {
        return contas.filter { it.saldo > 500000 }.plus(aplicaProximoFiltro(contas.filterNot { it.saldo > 500000 }))
    }

}
