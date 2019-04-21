package com.dmagdaleno.designpatterns.command.pedidos

class FinalizaPedido(val pedido: Pedido): Comando {

    override fun executa() {
        pedido.finaliza()
    }
}