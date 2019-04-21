package com.dmagdaleno.designpatterns.facade.vendas

class BuscaCliente {

    fun buscaClientePor(cpf: String): String {
        return "Cliente $cpf"
    }
}