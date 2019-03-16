package com.dmagdaleno.designpatterns.chainofresponsability.contas

class RespostaPadrao : Resposta {

    override fun responde(requisicao: Requisicao, conta: Conta) = imprimeFormatoPadrao(conta)

    private fun imprimeFormatoPadrao(conta: Conta) = "Titular: ${conta.nome}, Saldo: ${conta.saldo}"

    override fun setProximo(resposta: Resposta) { /* nunca tem proximo */ }
}