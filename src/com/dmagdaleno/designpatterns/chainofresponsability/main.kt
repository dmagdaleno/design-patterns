package com.dmagdaleno.designpatterns.chainofresponsability

fun main(){
    val itens = mutableListOf(
        Item("Caneta", 9.0),
        Item("Caneta", 9.0),
        Item("Caneta", 9.0),
        Item("Caneta", 9.0),
        Item("Caneta", 5.0),
        Item("Lapis", 2.0))

    val orcamento = Orcamento(itens)

    println("Valor do orcamento: ${orcamento.valorTotal}")

    println("Desconto: ${calculaDesconto(orcamento)}")
}