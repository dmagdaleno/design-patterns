package com.dmagdaleno.designpatterns.templatemethod.impostos

data class Orcamento(private val itens: MutableList<Item>) {

    private var valor: Double = .0

    val valorTotal: Double
        get() {
            return valor
        }

    init {
        valor = itens.sumByDouble { it.valor }
    }

    fun adicionaItem(item: Item){
        itens.add(item)
        valor += item.valor
    }

    fun getItens(): List<Item> {
        return itens
    }
}