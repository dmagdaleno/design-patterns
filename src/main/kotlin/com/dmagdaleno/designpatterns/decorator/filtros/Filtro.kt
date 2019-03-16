package com.dmagdaleno.designpatterns.decorator.filtros

abstract class Filtro(protected val outroFiltro: Filtro? = null) {

    abstract fun filtra(contas: List<Conta>): List<Conta>

    protected fun aplicaProximoFiltro(contas: List<Conta>): List<Conta> {
        val filtro = outroFiltro ?: return emptyList()
        return filtro.filtra(contas)
    }
}