package com.dmagdaleno.designpatterns.templatemethod.relatorios

import java.time.LocalDate

class RelatorioComplexo : TemplateRelatorio() {

    override fun geraCabecalho(banco: Banco) =
        "Banco: ${banco.nome}, End.: ${banco.endereco}, Tel.: ${banco.telefone}"

    override fun geraConteudo(conta: Conta) =
        "Agência: ${conta.idAgencia}, Conta: ${conta.id}, Titular: ${conta.titular}, Saldo: ${conta.saldo}"

    override fun geraRodape(banco: Banco) =
        "Email: ${banco.email}, ${LocalDate.now()}"
}