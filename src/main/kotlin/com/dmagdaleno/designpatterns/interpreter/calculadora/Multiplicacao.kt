package com.dmagdaleno.designpatterns.interpreter.calculadora

class Multiplicacao(expressaoEsquerda: Expressao, expressaoDireita: Expressao)
    : Operacao(expressaoEsquerda, expressaoDireita) {

    override fun avalia(valor1: Int, valor2: Int) = valor1 * valor2
}