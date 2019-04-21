package com.dmagdaleno.designpatterns.facade.vendas

class VendaFacade {

    fun geraPedidoERetornaBoleto(cpf: String): String {
        val cliente = BuscaCliente().buscaClientePor(cpf)
        val pedido = GeraPedido().geraPedidoDo(cliente)
        val boleto = EmissorDeBoleto().emiteBoleto(pedido)
        return boleto
    }
}