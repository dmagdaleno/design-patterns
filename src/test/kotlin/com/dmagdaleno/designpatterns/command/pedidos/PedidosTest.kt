package com.dmagdaleno.designpatterns.command.pedidos

import org.assertj.core.api.Assertions.assertThat
import org.junit.Test

class PedidosTest {

    @Test
    fun deveCriarNovoPedido() {
        val pedido = Pedido("Cliente 1", 50.0)

        assertThat(pedido.situacao).isEqualTo(SituacaoPedido.NOVO)
    }

    @Test
    fun devePagarPedido() {
        val pedido = Pedido("Cliente 1", 50.0)
        pedido.paga()

        assertThat(pedido.situacao).isEqualTo(SituacaoPedido.PAGO)
    }

    @Test
    fun deveFinalizarPedido() {
        val pedido = Pedido("Cliente 1", 50.0)
        pedido.paga()
        pedido.finaliza()

        assertThat(pedido.situacao).isEqualTo(SituacaoPedido.FINALIZADO)
    }

    @Test
    fun deveExecutarFilaDeComandos() {
        val pedido1 = Pedido("Cliente 1", 50.0)
        val pedido2 = Pedido("Cliente 2", 150.0)

        val fila = FilaDeComandos()
        fila.adicionaComando(PagaPedido(pedido1))
        fila.adicionaComando(PagaPedido(pedido2))
        fila.adicionaComando(FinalizaPedido(pedido1))
        fila.processa()

        assertThat(pedido1.situacao).isEqualTo(SituacaoPedido.FINALIZADO)
        assertThat(pedido2.situacao).isEqualTo(SituacaoPedido.PAGO)
    }
}