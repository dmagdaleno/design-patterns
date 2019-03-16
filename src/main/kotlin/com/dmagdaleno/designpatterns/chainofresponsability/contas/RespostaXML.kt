package com.dmagdaleno.designpatterns.chainofresponsability.contas

class RespostaXML : Resposta {

    private var proximo: Resposta? = null

    override fun responde(requisicao: Requisicao, conta: Conta) =
        if(requisicao.formato == Formato.XML)
            imprimeXML(conta)
        else
            proximo?.responde(requisicao, conta) ?: ""


    private fun imprimeXML(conta: Conta) =
        "<conta><titular>${conta.nome}</titular><saldo>${conta.saldo}</saldo></conta>"

    override fun setProximo(resposta: Resposta) {
        this.proximo = resposta
    }
}