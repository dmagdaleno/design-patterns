package com.dmagdaleno.designpatterns.visitor.impressora

import org.assertj.core.api.Assertions.assertThat
import org.junit.Test

class ImpressoraTest {

    private val impressora = ImpressoraVisitor()

    @Test
    fun deveImprimirDoisMaisDois(){
        val expressao = Soma(Numero(2), Numero(2))

        val impressao = expressao.aceita(impressora)

        assertThat(impressao).isEqualTo("(2 + 2)")
    }

    @Test
    fun deveImprimirDoisMaisDoisMenosTres(){
        val expressao = Subtracao(Soma(Numero(2), Numero(2)), Numero(3))

        val impressao = expressao.aceita(impressora)

        assertThat(impressao).isEqualTo("((2 + 2) - 3)")
    }

    @Test
    fun deveImprimirDoisVezesDois() {
        val expressao = Multiplicacao(Numero(2), Numero(2))

        val impressao = expressao.aceita(impressora)

        assertThat(impressao).isEqualTo("(2 * 2)")
    }

    @Test
    fun deveImprimirDoisDivididoPorDois(){
        val expressao = Divisao(Numero(2), Numero(2))

        val impressao = expressao.aceita(impressora)

        assertThat(impressao).isEqualTo("(2 / 2)")
    }

    @Test
    fun deveImprimirUmDivididoPorDois(){
        val expressao = Divisao(Numero(1), Numero(2))

        val impressao = expressao.aceita(impressora)

        assertThat(impressao).isEqualTo("(1 / 2)")
    }
}