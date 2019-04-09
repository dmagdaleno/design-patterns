package com.dmagdaleno.designpatterns.visitor.impressora

abstract class Operacao(
    val expressaoEsquerda: Expressao,
    val expressaoDireita: Expressao
): Expressao {

    override fun avalia(): Int {
        val valor1 = expressaoEsquerda.avalia()
        val valor2 = expressaoDireita.avalia()
        return avalia(valor1, valor2)
    }

    abstract fun avalia(valor1: Int, valor2: Int): Int

    abstract fun operador(): String

    override fun aceita(visitor: Visitor): String {
        return visitor.visitaOperacao(this)
    }
}