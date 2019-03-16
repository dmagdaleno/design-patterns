package com.dmagdaleno.designpatterns.chainofresponsability.descontos

import com.dmagdaleno.designpatterns.extensions.arredonda
import org.assertj.core.api.Assertions.assertThat
import org.junit.Test

class DescontosTest {

    @Test
    fun deveRealizarDescontoPorCincoItens(){
        // dado que...
        val itens = mutableListOf(
            Item("Caneta", 5.0),
            Item("Caneta", 5.0),
            Item("Caneta", 5.0),
            Item("Caneta", 5.0),
            Item("Caneta", 5.0),
            Item("Lapis", 2.0)
        )

        val orcamento = Orcamento(itens)

        // quando...
        val desconto = calculaDesconto(orcamento).arredonda(3)

        // entao...
        assertThat(desconto).isEqualTo(2.7)
    }

    @Test
    fun deveRealizarDescontoPorValor(){
        // dado que...
        val itens = mutableListOf(
            Item("Caneta", 5.0),
            Item("Caneta", 5.0),
            Item("Caneta", 5.0),
            Item("Caneta", 5.0),
            Item("Mochila", 31.0)
        )

        val orcamento = Orcamento(itens)

        // quando...
        val desconto = calculaDesconto(orcamento).arredonda(3)

        // entao...
        assertThat(desconto).isEqualTo(3.57)
    }
}