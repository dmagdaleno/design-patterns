package com.dmagdaleno.designpatterns.chainofresponsability.descontos

class DescontoPorCincoItens : Desconto {

    private var proximo: Desconto? = null

    override fun desconta(orcamento: Orcamento) =
        if(orcamento.getItens().size > 5)
            orcamento.valorTotal * 0.1
        else
            proximo?.desconta(orcamento) ?: .0

    override fun setProximo(desconto: Desconto) {
        this.proximo = desconto
    }
}