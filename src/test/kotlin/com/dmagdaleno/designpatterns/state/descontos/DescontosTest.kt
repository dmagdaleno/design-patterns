package com.dmagdaleno.designpatterns.state.descontos

import org.assertj.core.api.Assertions.assertThat
import org.junit.Test
import java.lang.IllegalStateException

class DescontosTest {

    @Test
    fun aplicaDescontoParaOrcamentoEmAprovacao() {
        val orcamento = Orcamento(500.0)

        orcamento.aplicaDesconto()

        assertThat(orcamento.valor).isEqualTo(475.0)
    }

    @Test
    fun aplicaDescontoParaOrcamentoAprovado() {
        val orcamento = Orcamento(500.0)

        orcamento.aprova()
        orcamento.aplicaDesconto()

        assertThat(orcamento.valor).isEqualTo(490.0)
    }

    @Test(expected = IllegalStateException::class)
    fun aplicaDescontoParaOrcamentoReprovado() {
        val orcamento = Orcamento(500.0)

        orcamento.reprova()
        orcamento.aplicaDesconto()
    }

    @Test(expected = IllegalStateException::class)
    fun aplicaDescontoParaOrcamentoFinalizado() {
        val orcamento = Orcamento(500.0)

        orcamento.reprova()
        orcamento.finaliza()
        orcamento.aplicaDesconto()
    }
}