package com.dmagdaleno.designpatterns.facade.vendas

class GeraPedido {

    fun geraPedidoDo(cliente: String): Int {
        val numeroDoPedido = cliente.hashCode()
        return numeroDoPedido
    }
}