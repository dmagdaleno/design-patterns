package com.dmagdaleno.designpatterns.templatemethod.relatorios

import java.time.LocalDate

class RelatorioSimples : TemplateRelatorio() {

    override fun geraCabecalho(banco: Banco) = "Banco: ${banco.nome}"

    override fun geraConteudo(conta: Conta) = "Titular: ${conta.titular}, Saldo: ${conta.saldo}"

    override fun geraRodape(banco: Banco) = "Tel.: ${banco.telefone}"
}