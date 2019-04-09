package com.dmagdaleno.designpatterns.visitor.impressora

interface Expressao {

    fun avalia(): Int

    fun aceita(visitor: Visitor): String
}