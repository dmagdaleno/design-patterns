package com.dmagdaleno.designpatterns.chainofresponsability.descontos

interface Desconto {

    fun desconta(orcamento: Orcamento): Double

    fun setProximo(desconto: Desconto)

}