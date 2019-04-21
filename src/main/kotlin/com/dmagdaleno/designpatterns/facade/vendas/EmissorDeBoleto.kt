package com.dmagdaleno.designpatterns.facade.vendas

class EmissorDeBoleto {

    fun emiteBoleto(pedido: Int): String {
        return "Boleto do pedido: $pedido"
    }
}