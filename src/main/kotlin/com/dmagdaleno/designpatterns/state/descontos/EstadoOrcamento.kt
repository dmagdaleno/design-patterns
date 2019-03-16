package com.dmagdaleno.designpatterns.state.descontos

interface EstadoOrcamento {

    fun aplicaDesconto(orcamento: Orcamento)

    fun aprova(orcamento: Orcamento)

    fun reprova(orcamento: Orcamento)

    fun finaliza(orcamento: Orcamento)
}
