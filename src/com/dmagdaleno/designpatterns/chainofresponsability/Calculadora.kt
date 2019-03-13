package com.dmagdaleno.designpatterns.chainofresponsability

fun calculaDesconto(orcamento: Orcamento): Double {
    val descontoPorCincoItens = DescontoPorCincoItens()
    val descontoPorValor = DescontoPorValor(50.0)

    descontoPorCincoItens.setProximo(descontoPorValor)

    return descontoPorCincoItens.desconta(orcamento)
}