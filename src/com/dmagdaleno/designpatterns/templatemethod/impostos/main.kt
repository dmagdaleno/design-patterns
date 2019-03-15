package com.dmagdaleno.designpatterns.templatemethod.impostos

fun main(){

    val itens = mutableListOf(
        Item("Caneta", 100.0),
        Item("Caneta", 100.0),
        Item("Caneta", 100.0),
        Item("Caneta", 100.0),
        Item("Lapis", 101.0)
    )

    val orcamento = Orcamento(itens)

    val ikcv = IKCV()
    val icpp = ICPP()

    println("Imposto IKCV: ${ikcv.calcula(orcamento)}")
    println("Imposto ICPP: ${icpp.calcula(orcamento)}")

    val itensSemRepeticao = mutableListOf(
        Item("Caneta1", 100.0),
        Item("Caneta2", 100.0),
        Item("Caneta3", 100.0),
        Item("Caneta4", 100.0),
        Item("Lapis", 101.0)
    )

    val orcamentoSemRepeticao = Orcamento(itensSemRepeticao)

    val ihit = IHIT()

    println("Imposto IHIT: ${ihit.calcula(orcamento)}")
    println("Imposto IHIT: ${ihit.calcula(orcamentoSemRepeticao)}")

}