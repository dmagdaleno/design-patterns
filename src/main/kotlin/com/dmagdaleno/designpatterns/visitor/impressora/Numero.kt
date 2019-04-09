package com.dmagdaleno.designpatterns.visitor.impressora

class Numero(val valor: Int): Expressao {

    override fun avalia() = valor

    override fun aceita(visitor: Visitor): String {
        return visitor.visitaNumero(this)
    }

}