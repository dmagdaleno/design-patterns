package com.dmagdaleno.designpatterns.templatemethod.impostos

fun main(){

    val itens = mutableListOf(
        Item("Caneta", 99.0),
        Item("Caneta", 99.0),
        Item("Caneta", 99.0),
        Item("Caneta", 95.0),
        Item("Lapis", 299.0)
    )

    val orcamento = Orcamento(itens)

    val ikcv = IKCV()
    val icpp = ICPP()

    println("Imposto: ${ikcv.calcula(orcamento)}")
    println("Imposto: ${icpp.calcula(orcamento)}")
}