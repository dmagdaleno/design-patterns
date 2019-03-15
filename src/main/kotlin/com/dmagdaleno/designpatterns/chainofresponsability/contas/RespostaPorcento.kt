package com.dmagdaleno.designpatterns.chainofresponsability.contas

class RespostaPorcento : Resposta {

    private var proximo: Resposta? = null

    override fun responde(requisicao: Requisicao, conta: Conta) {
        if(requisicao.formato == Formato.PORCENTO)
            imprimeSeparadoPorPorcento(conta)
        else
            proximo?.responde(requisicao, conta)
    }

    private fun imprimeSeparadoPorPorcento(conta: Conta) {
        println("${conta.nome}%${conta.saldo}")
    }

    override fun setProximo(resposta: Resposta) {
        this.proximo = resposta
    }
}