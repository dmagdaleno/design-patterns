package com.dmagdaleno.designpatterns.builder.notas

import org.assertj.core.api.Assertions.assertThat
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

        assertThat(notaFiscal.razaoSocial).isEqualTo("Empresa SA")
        assertThat(notaFiscal.cnpj).isEqualTo("012.345.567/0001-80")
        assertThat(notaFiscal.observacao).isEqualTo("NA")
        assertThat(notaFiscal.itens).hasSameElementsAs(listOf(
            Item("Item 1", 10.0),
            Item("Item 2", 30.0),
            Item("Item 3", 60.0)))
        assertThat(notaFiscal.valor).isEqualTo(100.0)
        assertThat(notaFiscal.imposto).isEqualTo(5.0)
    }

}