package com.dmagdaleno.designpatterns.chainofresponsability.contas

import org.assertj.core.api.Assertions
import org.junit.Before
import org.junit.Test

class ContasTest {

    val primeira = RespostaXML()
    val segunda = RespostaCSV()
    val tereceira = RespostaPorcento()

    @Before
    fun setup() {
        primeira.setProximo(segunda)
        segunda.setProximo(tereceira)
        tereceira.setProximo(RespostaPadrao())
    }

    @Test
    fun deveResponderEmXML() {
        // dado que...
        val conta = Conta("João da Silva", 1500.0)
        val requisicao = Requisicao(Formato.XML)

        // quando
        val resposta = primeira.responde(requisicao, conta)

        // então...
        val respostaEsperada = "<conta><titular>João da Silva</titular><saldo>1500.0</saldo></conta>"
        Assertions.assertThat(resposta).isEqualTo(respostaEsperada)
    }

    @Test
    fun deveResponderEmCSV() {
        // dado que...
        val conta = Conta("João da Silva", 1500.0)
        val requisicao = Requisicao(Formato.CSV)

        // quando
        val resposta = primeira.responde(requisicao, conta)

        // então...
        val respostaEsperada = "João da Silva,1500.0"
        Assertions.assertThat(resposta).isEqualTo(respostaEsperada)
    }

    @Test
    fun deveResponderEmPorcento() {
        // dado que...
        val conta = Conta("João da Silva", 1500.0)
        val requisicao = Requisicao(Formato.PORCENTO)

        // quando
        val resposta = primeira.responde(requisicao, conta)

        // então...
        val respostaEsperada = "João da Silva%1500.0"
        Assertions.assertThat(resposta).isEqualTo(respostaEsperada)
    }
}