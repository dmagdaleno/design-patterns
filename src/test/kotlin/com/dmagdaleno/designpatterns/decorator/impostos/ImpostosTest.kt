package com.dmagdaleno.designpatterns.decorator.impostos

import org.assertj.core.api.Assertions.assertThat
import org.junit.Test

class ImpostosTest {

    val orcamento = Orcamento(100.0)

    @Test
    fun testaImpostoISSCompostoComICMS(){
        // dado que...
        val iss = ISS()
        val icms = ICMS()
        val issComIcms = ISS(ICMS())

        //quando...
        val calculoIss = iss.calcula(orcamento)
        val calculoIcms = icms.calcula(orcamento)
        val calculoIssComIcms = issComIcms.calcula(orcamento)

        //então...
        assertThat(calculoIssComIcms).isEqualTo(calculoIss + calculoIcms)

    }
}