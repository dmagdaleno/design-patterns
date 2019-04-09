package com.dmagdaleno.designpatterns.visitor.impressora

interface Visitor {

    fun visitaOperacao(operacao: Operacao): String

    fun visitaNumero(numero: Numero): String
}