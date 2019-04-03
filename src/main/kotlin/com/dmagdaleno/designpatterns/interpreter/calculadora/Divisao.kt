package com.dmagdaleno.designpatterns.interpreter.calculadora

class Divisao(expressaoEsquerda: Expressao, expressaoDireita: Expressao)
    : Operacao(expressaoEsquerda, expressaoDireita) {

    override fun avalia(valor1: Int, valor2: Int): Int = valor1 / valor2
}