package com.dmagdaleno.designpatterns.interpreter.calculadora

import org.assertj.core.api.Assertions.assertThat
import org.junit.Test

class CalculadoraTest {

    @Test
    fun deveSomarDoisEDois(){
        val expressao = Soma(Numero(2), Numero(2)).avalia()

        assertThat(expressao).isEqualTo(4)
    }

    @Test
    fun deveSubtrairTresAposSomarDoisEDois(){
        val expressao = Subtracao(Soma(Numero(2), Numero(2)), Numero(3)).avalia()

        assertThat(expressao).isEqualTo(1)
    }

    @Test
    fun deveMultiplicarDoisEDois() {
        val expressao = Multiplicacao(Numero(2), Numero(2)).avalia()

        assertThat(expressao).isEqualTo(4)
    }

    @Test
    fun deveDividirDoisPorDois(){
        val expressao = Divisao(Numero(2), Numero(2)).avalia()

        assertThat(expressao).isEqualTo(1)
    }

    @Test
    fun deveDividirUmPorDois(){
        val expressao = Divisao(Numero(1), Numero(2)).avalia()

        assertThat(expressao).isEqualTo(0)
    }
}