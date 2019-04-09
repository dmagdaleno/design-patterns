package com.dmagdaleno.designpatterns.visitor.impressora

class ImpressoraVisitor: Visitor {

    override fun visitaOperacao(operacao: Operacao): String {
        return "(${expressaoEsquerda(operacao)} ${operacao.operador()} ${expressaoDireita(operacao)})"
    }

    private fun expressaoEsquerda(operacao: Operacao): String {
        return operacao.expressaoEsquerda.aceita(this)
    }

    private fun expressaoDireita(operacao: Operacao): String {
        return operacao.expressaoDireita.aceita(this)
    }

    override fun visitaNumero(numero: Numero): String {
        return numero.valor.toString()
    }
}