package com.dmagdaleno.designpatterns.observer.notas

class Impressora: NotaFiscalObserver {
    override fun executa(notaFiscal: NotaFiscal) {
        println("<-- Nota Fiscal impressa")
    }
}
