package com.dmagdaleno.designpatterns.observer.notas

import java.time.LocalDate

class NotaFiscalBuilder {

    var razaoSocial: String = "Não definido"

    var cnpj: String = "Não definido"

    var observacao: String = ""

    var valor: Double = 0.0
        private set

    var imposto: Double = 0.0
        private set

    var itens: MutableList<Item> = mutableListOf()
        private set

    var dataEmissao: LocalDate = LocalDate.now()

    fun adicionaItem(item: Item): NotaFiscalBuilder {
        itens.add(item)
        this.valor += item.valor
        this.imposto += item.valor * 0.05

        return this
    }

    fun constroi(): NotaFiscal {
        return NotaFiscal(razaoSocial, cnpj, observacao, valor, imposto, itens, dataEmissao)
    }
}