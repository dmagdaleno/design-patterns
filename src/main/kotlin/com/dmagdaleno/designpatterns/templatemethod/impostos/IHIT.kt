package com.dmagdaleno.designpatterns.templatemethod.impostos

class IHIT : TemplateImpostoCondicional() {

    override fun deveUsarMaximaTaxacao(orcamento: Orcamento) =
        orcamento.getItens().size > orcamento.getItens().distinctBy { it.descricao }.size

    override fun maximaTaxacao(orcamento: Orcamento) = orcamento.valorTotal * 0.13 + 100

    override fun minimaTaxacao(orcamento: Orcamento) = orcamento.valorTotal * 0.01 * orcamento.getItens().size
}