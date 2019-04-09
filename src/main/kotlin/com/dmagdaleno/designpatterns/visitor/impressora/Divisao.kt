package com.dmagdaleno.designpatterns.visitor.impressora

class Divisao(expressaoEsquerda: Expressao, expressaoDireita: Expressao)
    : Operacao(expressaoEsquerda, expressaoDireita) {

    override fun avalia(valor1: Int, valor2: Int): Int = valor1 / valor2
}