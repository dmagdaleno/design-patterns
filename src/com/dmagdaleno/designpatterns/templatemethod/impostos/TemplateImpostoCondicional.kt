package com.dmagdaleno.designpatterns.templatemethod.impostos

abstract class TemplateImpostoCondicional: Imposto {

    override fun calcula(orcamento: Orcamento) =
        if(deveUsarMaximaTaxacao(orcamento))
            maximaTaxacao(orcamento)
        else
            minimaTaxacao(orcamento)

    abstract fun deveUsarMaximaTaxacao(orcamento: Orcamento): Boolean

    abstract fun maximaTaxacao(orcamento: Orcamento): Double

    abstract fun minimaTaxacao(orcamento: Orcamento): Double

}