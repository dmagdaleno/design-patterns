package com.dmagdaleno.designpatterns.memento.contratos

import com.dmagdaleno.designpatterns.extensions.removeLast

class Historico {

    private val estados = mutableListOf<TipoContrato>()

    fun pega(): TipoContrato {
        val estado = estados.last()
        estados.removeLast()
        return estado
    }

    fun empilha(estado: TipoContrato) {
        estados.add(estado)
    }
}
