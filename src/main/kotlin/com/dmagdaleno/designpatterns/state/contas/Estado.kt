package com.dmagdaleno.designpatterns.state.contas

interface Estado {

    fun realizaSaque(conta: Conta, valor: Double)

    fun realizaDeposito(conta: Conta, valor: Double)
}