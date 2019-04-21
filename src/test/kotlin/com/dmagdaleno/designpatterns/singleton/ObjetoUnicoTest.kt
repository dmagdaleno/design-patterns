package com.dmagdaleno.designpatterns.singleton

import org.assertj.core.api.Assertions.assertThat
import org.junit.FixMethodOrder
import org.junit.Test
import org.junit.runners.MethodSorters

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
class ObjetoUnicoTest {

    @Test
    fun criaInstanciaDeFormaLazy() {
        val chamada = ObjetoUnico.metodoEstaticoQueNaoPrecisaDeInstancia()

        assertThat(chamada).isEqualTo("chamou metodo")
        assertThat(ObjetoUnico.qtdInstancias).isEqualTo(0)
    }

    @Test
    fun deveGerarApenasUmaInstancia() {
        val ref1 = ObjetoUnico.getInstancia()
        val ref2 = ObjetoUnico.getInstancia()

        assertThat(ref1).isSameAs(ref2)
        assertThat(ref1.atributo).isSameAs(ref2.atributo)
        assertThat(ObjetoUnico.qtdInstancias).isEqualTo(1)
    }
}