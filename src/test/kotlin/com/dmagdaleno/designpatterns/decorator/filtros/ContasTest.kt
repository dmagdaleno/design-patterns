package com.dmagdaleno.designpatterns.decorator.filtros

import org.assertj.core.api.Assertions.assertThat
import org.junit.Test
import java.time.LocalDate

class ContasTest {

    val filtros: Filtro = FiltroSaldoBaixo(FiltroSaldoAlto(FiltroContaNova()))

    @Test
    fun testaFiltroContasSemMultiplosEnquadramentos(){
        //dado que...
        val conta1 = Conta("João da Silva", 1000.0, LocalDate.now())
        val conta2 = Conta("Primo Rico", 1000000.0, LocalDate.of(2000, 5, 13))
        val conta3 = Conta("Jaqueline Pereira", 9999.99, LocalDate.of(2010, 9, 19))
        val conta4 = Conta("Pedro Ferrado", 99.99, LocalDate.of(2000, 1, 1))

        val contas = listOf(conta1, conta2, conta3, conta4)

        //quando...
        val contasSuspeitas = filtros.filtra(contas)

        //entao...
        val contasEsperadas = listOf(conta1, conta2, conta4)

        assertThat(contasSuspeitas).hasSameElementsAs(contasEsperadas)
        assertThat(contasSuspeitas.size).isEqualTo(contasEsperadas.size)
    }

    @Test
    fun testaFiltroContasComMultiplosEnquadramentos(){
        //dado que...
        val conta1 = Conta("João da Silva", 90.0, LocalDate.now())
        val conta2 = Conta("Primo Rico", 1000000.0, LocalDate.of(2000, 5, 13))
        val conta3 = Conta("Jaqueline Pereira", 9999.99, LocalDate.of(2010, 9, 19))
        val conta4 = Conta("Pedro Ferrado", 99.99, LocalDate.of(2000, 1, 1))

        val contas = listOf(conta1, conta2, conta3, conta4)

        //quando...
        val contasSuspeitas = filtros.filtra(contas)

        //entao...
        val contasEsperadas = listOf(conta1, conta2, conta4)

        assertThat(contasSuspeitas).hasSameElementsAs(contasEsperadas)
        assertThat(contasSuspeitas.size).isEqualTo(contasEsperadas.size)
    }
}