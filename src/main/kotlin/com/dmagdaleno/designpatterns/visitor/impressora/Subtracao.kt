package com.dmagdaleno.designpatterns.visitor.impressora

class Subtracao(expressaoEsquerda: Expressao, expressaoDireita: Expressao)
    : Operacao(expressaoEsquerda, expressaoDireita) {

    override fun avalia(valor1: Int, valor2: Int) = valor1 - valor2

    override fun operador() = "-"
}