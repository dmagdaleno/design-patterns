package com.dmagdaleno.designpatterns.interpreter.calculadora

class Numero(private val numero: Int): Expressao {

    override fun avalia() = numero

}