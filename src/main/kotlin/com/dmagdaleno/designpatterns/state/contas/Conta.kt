package com.dmagdaleno.designpatterns.state.contas

import java.lang.IllegalStateException

class Conta(saldoInicial: Double = 0.0) {

    var saldo = saldoInicial
        private set

    var estado: Estado = Positivo()
        private set

    init {
        atualizaEstado(this)
    }

    fun deposita(valor: Double) {
        estado.realizaDeposito(this, valor)
        atualizaEstado(this)
    }

    fun saca(valor: Double) {
        estado.realizaSaque(this, valor)
        atualizaEstado(this)
    }

    private fun atualizaEstado(conta: Conta) {
        if(conta.saldo < 0.0)
            estado = Negativo()
        else
            estado = Positivo()
    }

    private class Positivo: Estado {
        override fun realizaSaque(conta: Conta, valor: Double) {
            conta.saldo = conta.saldo - valor
        }

        override fun realizaDeposito(conta: Conta, valor: Double) {
            conta.saldo = conta.saldo + (valor * 0.98)
        }
    }

    private class Negativo: Estado {
        override fun realizaSaque(conta: Conta, valor: Double) {
            throw IllegalStateException("Não é possível realizar saques de contas negativas")
        }

        override fun realizaDeposito(conta: Conta, valor: Double) {
            conta.saldo = conta.saldo + (valor * 0.95)
        }
    }
}