package com.dmagdaleno.designpatterns.strategy.investimentos

import com.dmagdaleno.designpatterns.extensions.arredonda
import org.assertj.core.api.Assertions.assertThat
import org.junit.Test

class InvestimentosTest {

    @Test
    fun calculaJurosDeInvestimentoConservadorComImposto() {
        // dado que o valor é 100
        val valor = 100.0

        // quando calcula juros de investimento Conservador com imposto
        val imposto = calculaJurosComImposto(valor, Conservador()).arredonda(3)

        // os juros devem ser de 0.6
        assertThat(imposto).isEqualTo(0.6)
    }

    @Test
    fun calculaJurosDeInvestimentoModeradoComImposto() {
        // dado que o valor é 100
        val valor = 100.0

        // quando calcula juros de investimento Moderado com imposto
        val imposto = calculaJurosComImposto(valor, Moderado()).arredonda(3)

        // os juros devem ser de 1.875 ou 0.525
        assertThat(imposto).isIn(1.875, 0.525)
    }

    @Test
    fun calculaJurosDeInvestimentoArrojadoComImposto() {
        // dado que o valor é 100
        val valor = 100.0

        // quando calcula juros de investimento Arrojado com imposto
        val imposto = calculaJurosComImposto(valor, Arrojado()).arredonda(3)

        // os juros devem ser de 3.75, 2.25 ou 0.45
        assertThat(imposto).isIn(3.75, 2.25, 0.45)
    }
}