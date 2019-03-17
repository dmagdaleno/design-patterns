package com.dmagdaleno.designpatterns.observer.notas

import java.time.LocalDate

data class NotaFiscal (
    val razaoSocial: String,
    val cnpj: String,
    val observacao: String,
    val valor: Double,
    val imposto: Double,
    val itens: List<Item>,
    val dataEmissao: LocalDate
)