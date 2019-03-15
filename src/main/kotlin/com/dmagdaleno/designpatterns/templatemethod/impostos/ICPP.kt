package com.dmagdaleno.designpatterns.templatemethod.impostos

class ICPP: TemplateImpostoCondicional() {

    override fun deveUsarMaximaTaxacao(orcamento: Orcamento) = orcamento.valorTotal > 500

    override fun maximaTaxacao(orcamento: Orcamento) = orcamento.valorTotal * 0.07

    override fun minimaTaxacao(orcamento: Orcamento) = orcamento.valorTotal * 0.05
}