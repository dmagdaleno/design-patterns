package com.dmagdaleno.designpatterns.chainofresponsability

class DescontoPorValor(private val valorLimite: Double) : Desconto {

    private var proximo: Desconto? = null

    override fun desconta(orcamento: Orcamento) =
        if(orcamento.valorTotal > valorLimite)
            orcamento.valorTotal * 0.07
        else
            proximo?.desconta(orcamento) ?: .0

    override fun setProximo(desconto: Desconto) {
        this.proximo = desconto
    }
}