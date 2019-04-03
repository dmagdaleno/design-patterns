package com.dmagdaleno.designpatterns.interpreter.calculadora

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
}