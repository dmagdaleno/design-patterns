package com.dmagdaleno.designpatterns.memento.contratos

import java.lang.IllegalStateException
import java.time.LocalDate

data class Contrato(
    val data: LocalDate = LocalDate.now(),
    val cliente: String = "Indefinido",
    var tipo: TipoContrato = TipoContrato.NOVO
) {

    private val historico = Historico()

    fun avanca() {
        historico.empilha(tipo)
        when(tipo) {
            TipoContrato.NOVO -> tipo = TipoContrato.EM_ANDAMENTO

            TipoContrato.EM_ANDAMENTO -> tipo = TipoContrato.ACERTADO

            TipoContrato.ACERTADO -> tipo = TipoContrato.CONCLUIDO

            TipoContrato.CONCLUIDO -> throw IllegalStateException("Não é possível avançar")
        }
    }

    fun retorna() {
        tipo = historico.pega()
    }
}