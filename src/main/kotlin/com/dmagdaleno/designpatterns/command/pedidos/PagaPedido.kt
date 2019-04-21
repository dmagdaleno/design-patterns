package com.dmagdaleno.designpatterns.command.pedidos

class PagaPedido(val pedido: Pedido): Comando {

    override fun executa() {
        pedido.paga()
    }
}