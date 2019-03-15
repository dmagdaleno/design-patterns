package com.dmagdaleno.designpatterns.strategy.impostos

import com.dmagdaleno.designpatterns.extensions.arredonda
import org.junit.Test
import org.assertj.core.api.Assertions.assertThat

class ImpostosTest {

    @Test
    fun calculaImpostoISSOrcamentoDe100() {
        // dado que o orcamento é 100 e o imposto ISS é 6%
        val orcamento = Orcamento(100.0)

        // quando aplica o imposto ISS
        val imposto = calcula(orcamento, ISS())

        // o imposto deve ser 6.0
        assertThat(imposto).isEqualTo(6.0)
    }

    @Test
    fun calculaImpostoICMSOrcamentoDe100() {
        // dado que o orcamento é 100 e o imposto ICMS é 5% + 50
        val orcamento = Orcamento(100.0)

        // quando aplica o imposto ICMS
        val imposto = calcula(orcamento, ICMS())

        // o imposto deve ser 55.0
        assertThat(imposto).isEqualTo(55.0)
    }

    @Test
    fun calculaImpostoICCCcomOrcamentoDe100() {
        // dado que o orcamento é 100 e o imposto ICCC para valores menores que 1000 é 5%
        val orcamento = Orcamento(100.0)

        // quando aplica o imposto ICCC
        val imposto = calcula(orcamento, ICCC())

        // o imposto deve ser 5.0
        assertThat(imposto).isEqualTo(5.0)
    }

    @Test
    fun calculaImpostoICCCcomOrcamentoDe999() {
        // dado que o orcamento é 999.99 e o imposto ICCC para valores menores que 1000 é 5%
        val orcamento = Orcamento(999.99)

        // quando aplica o imposto ICCC
        val imposto = calcula(orcamento, ICCC()).arredonda(3)

        // o imposto deve ser 50.0
        assertThat(imposto).isEqualTo(50.0)
    }

    @Test
    fun calculaImpostoICCCcomOrcamentoDe1000() {
        // dado que o orcamento é 1000 e o imposto ICCC para valores menores que 3000 é 7%
        val orcamento = Orcamento(1000.0)

        // quando aplica o imposto ICCC
        val imposto = calcula(orcamento, ICCC())

        // o imposto deve ser 70.0
        assertThat(imposto).isEqualTo(70.0)
    }

    @Test
    fun calculaImpostoICCCcomOrcamentoDe3000() {
        // dado que o orcamento é 3000 e o imposto ICCC para valores menores ou iguais a 3000 é 7%
        val orcamento = Orcamento(3000.0)

        // quando aplica o imposto ICCC
        val imposto = calcula(orcamento, ICCC()).arredonda(3)

        // o imposto deve ser 210.0
        assertThat(imposto).isEqualTo(210.0)
    }

    @Test
    fun calculaImpostoICCCcomOrcamentoDe3001() {
        // dado que o orcamento é 3001 e o imposto ICCC para valores maiores que 3000 é 8% + 30
        val orcamento = Orcamento(3001.0)

        // quando aplica o imposto ICCC
        val imposto = calcula(orcamento, ICCC()).arredonda(3)

        // o imposto deve ser 270.08000000000004
        assertThat(imposto).isEqualTo(270.08)
    }
}