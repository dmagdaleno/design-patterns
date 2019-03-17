package com.dmagdaleno.designpatterns.observer.notas

import org.junit.Test

class NotaFiscalTest {

    @Test
    fun validMetodoDeConstrucaoDoBuilder() {
        val notaFiscal = NotaFiscalBuilder()
            .apply {
                razaoSocial = "Empresa SA"
                cnpj = "012.345.567/0001-80"
                observacao = "NA"
            }
            .adicionaItem(Item("Item 1", 10.0))
            .adicionaItem(Item("Item 2", 30.0))
            .adicionaItem(Item("Item 3", 60.0))
            .constroi()

        val observadores = listOf(EnviadorEmail(), EnviadorSMS(), NotaFiscalDao(), Impressora())
        val emissor = EmissorNotaFiscal(notaFiscal, observadores)
        emissor.emite()
    }

}