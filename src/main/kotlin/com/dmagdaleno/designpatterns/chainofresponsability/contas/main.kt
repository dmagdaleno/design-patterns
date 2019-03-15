package com.dmagdaleno.designpatterns.chainofresponsability.contas

fun main() {
    val conta = Conta("João da Silva", 1500.0)
    val requisicao = Requisicao(Formato.XML)

    val xml = RespostaXML()
    val csv = RespostaCSV()
    val porcento = RespostaPorcento()

    xml.setProximo(csv)
    csv.setProximo(porcento)
    porcento.setProximo(RespostaPadrao())

    xml.responde(requisicao, conta)
}