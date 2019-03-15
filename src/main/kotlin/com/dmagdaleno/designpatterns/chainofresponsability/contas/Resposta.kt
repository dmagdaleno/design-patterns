package com.dmagdaleno.designpatterns.chainofresponsability.contas

interface Resposta {

    fun responde(requisicao: Requisicao, conta: Conta)

    fun setProximo(resposta: Resposta)
}