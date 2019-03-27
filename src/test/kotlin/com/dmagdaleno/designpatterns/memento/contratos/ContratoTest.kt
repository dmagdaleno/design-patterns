package com.dmagdaleno.designpatterns.memento.contratos

import org.assertj.core.api.Assertions.assertThat
import org.junit.Test

class ContratoTest {

    @Test
    fun deveAvancarOEstadoDoContrato() {
        val contrato = Contrato(cliente = "João da Silva")

        assertThat(contrato.tipo).isEqualTo(TipoContrato.NOVO)

        contrato.avanca()

        assertThat(contrato.tipo).isEqualTo(TipoContrato.EM_ANDAMENTO)
    }

    @Test
    fun deveVoltarOEstadoDoContrato() {
        val contrato = Contrato(cliente = "João da Silva")

        assertThat(contrato.tipo).isEqualTo(TipoContrato.NOVO)

        contrato.avanca()
        contrato.avanca()
        contrato.retorna()

        assertThat(contrato.tipo).isEqualTo(TipoContrato.EM_ANDAMENTO)
    }
}