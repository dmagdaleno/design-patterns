package com.dmagdaleno.designpatterns.templatemethod.relatorios

abstract class TemplateRelatorio {

    fun imprime(banco: Banco, conta: Conta) =
        "${geraCabecalho(banco)}\n\n${geraConteudo(conta)}\n\n${geraRodape(banco)}"

    protected abstract fun geraCabecalho(banco: Banco): String

    protected abstract fun geraConteudo(conta: Conta): String

    protected abstract fun geraRodape(banco: Banco): String

}