package com.dmagdaleno.designpatterns.chainofresponsability

interface Desconto {

    fun desconta(orcamento: Orcamento): Double

    fun setProximo(desconto: Desconto)

}