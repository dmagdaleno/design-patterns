package com.dmagdaleno.designpatterns.chainofresponsability.contas

class RespostaCSV : Resposta {

    private var proximo: Resposta? = null

    override fun responde(requisicao: Requisicao, conta: Conta) =
        if(requisicao.formato == Formato.CSV)
            imprimeCSV(conta)
        else
            proximo?.responde(requisicao, conta) ?: ""

    private fun imprimeCSV(conta: Conta) = "${conta.nome},${conta.saldo}"

    override fun setProximo(resposta: Resposta) {
        this.proximo = resposta
    }
}