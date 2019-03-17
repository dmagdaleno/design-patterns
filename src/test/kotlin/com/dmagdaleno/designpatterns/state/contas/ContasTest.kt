package com.dmagdaleno.designpatterns.state.contas

import org.assertj.core.api.Assertions.assertThat
import org.junit.Test
import java.lang.IllegalStateException

class ContasTest {

    @Test
    fun realizaDepositoEmContaPositiva() {
        val conta = Conta(100.0)

        conta.deposita(100.0)

        assertThat(conta.saldo).isEqualTo(198.0)
    }

    @Test
    fun realizaDepositoEmContaNegativa() {
        val conta = Conta(-100.0)

        conta.deposita(100.0)

        assertThat(conta.saldo).isEqualTo(-5.0)
    }

    @Test
    fun realizaSaqueEmContaPositiva() {
        val conta = Conta(100.0)

        conta.saca(100.0)

        assertThat(conta.saldo).isEqualTo(0.0)
    }

    @Test(expected = IllegalStateException::class)
    fun realizaSaqueEmContaNegativa() {
        val conta = Conta(-100.0)

        conta.saca(1.0)
    }
}