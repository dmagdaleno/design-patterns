package com.dmagdaleno.designpatterns.command.pedidos

import java.time.LocalDate

data class Pedido (
    val cliente: String = "indefinido",
    val valor: Double = 0.0
) {

    var dataFinalizacao: LocalDate? = null
    var situacao: SituacaoPedido = SituacaoPedido.NOVO

    fun paga() {
        println("Pagando pedido do $cliente")
        situacao = SituacaoPedido.PAGO
    }

    fun finaliza() {
        println("finalizando pedido do $cliente")
        dataFinalizacao = LocalDate.now()
        situacao = SituacaoPedido.FINALIZADO
    }
}