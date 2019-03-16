package com.dmagdaleno.designpatterns.chainofresponsability.contas

interface Resposta {

    fun responde(requisicao: Requisicao, conta: Conta): String

    fun setProximo(resposta: Resposta)
}