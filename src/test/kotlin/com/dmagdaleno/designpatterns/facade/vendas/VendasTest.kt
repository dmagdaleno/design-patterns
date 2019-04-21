package com.dmagdaleno.designpatterns.facade.vendas

import org.assertj.core.api.Assertions.assertThat
import org.junit.Test

class VendasTest {

    @Test
    fun testaVendasFacade() {
        val cpf = "333"
        val boletoFacade = VendaFacade().geraPedidoERetornaBoleto(cpf)

        assertThat(boletoFacade).isEqualTo(
            EmissorDeBoleto().emiteBoleto(
                GeraPedido().geraPedidoDo(
                    BuscaCliente().buscaClientePor(cpf))))
    }
}