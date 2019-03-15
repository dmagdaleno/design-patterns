package com.dmagdaleno.designpatterns.templatemethod.impostos

class IKCV : TemplateImpostoCondicional() {

    override fun deveUsarMaximaTaxacao(orcamento: Orcamento) =
        orcamento.valorTotal > 500 && temItemMaiorQueCemReais(orcamento)

    private fun temItemMaiorQueCemReais(orcamento: Orcamento): Boolean {
        return orcamento.getItens().any { it.valor > 100 }
    }

    override fun maximaTaxacao(orcamento: Orcamento) = orcamento.valorTotal * 0.1

    override fun minimaTaxacao(orcamento: Orcamento) = orcamento.valorTotal * 0.06
}