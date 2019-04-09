package com.dmagdaleno.designpatterns.visitor.impressora

class Numero(private val numero: Int): Expressao {

    override fun avalia() = numero

}