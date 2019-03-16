package com.dmagdaleno.designpatterns.templatemethod.impostos

import org.assertj.core.api.Assertions.assertThat
import org.junit.Test

class ImpostosTest {

    @Test
    fun calculaImpostoIKCVTaxaMaxima() {
        // dado que...
        val itens = mutableListOf(
            Item("Mochila", 100.0),
            Item("Mochila", 100.0),
            Item("Mochila", 100.0),
            Item("Mochila", 100.0),
            Item("Mala", 101.0)
        )

        val orcamento = Orcamento(itens)

        // quando...
        val imposto = IKCV().calcula(orcamento)

        // então...
        assertThat(imposto).isEqualTo(50.1)
    }

    @Test
    fun calculaImpostoIKCVTaxaMinima() {
        // dado que...
        val itens = mutableListOf(
            Item("Mochila", 100.0),
            Item("Mochila", 100.0),
            Item("Mochila", 100.0),
            Item("Mochila", 100.0),
            Item("Mochila", 100.0)
        )

        val orcamento = Orcamento(itens)

        // quando...
        val imposto = IKCV().calcula(orcamento)

        // então...
        assertThat(imposto).isEqualTo(30.0)
    }

    @Test
    fun calculaImpostoICPPTaxaMaxima() {
        // dado que...
        val itens = mutableListOf(
            Item("Mochila", 100.0),
            Item("Mochila", 100.0),
            Item("Mochila", 100.0),
            Item("Mochila", 100.0),
            Item("Mala", 101.0)
        )

        val orcamento = Orcamento(itens)

        // quando aplica o imposto ISS
        val imposto = ICPP().calcula(orcamento)

        // então...
        assertThat(imposto).isEqualTo(35.07)
    }

    @Test
    fun calculaImpostoICPPTaxaMinima() {
        // dado que...
        val itens = mutableListOf(
            Item("Mochila", 100.0),
            Item("Mochila", 100.0),
            Item("Mochila", 100.0),
            Item("Mochila", 100.0),
            Item("Mochila", 100.0)
        )

        val orcamento = Orcamento(itens)

        // quando aplica o imposto ISS
        val imposto = ICPP().calcula(orcamento)

        // então...
        assertThat(imposto).isEqualTo(25.0)
    }
}