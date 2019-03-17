package com.dmagdaleno.designpatterns.observer.notas

class NotaFiscalDao: NotaFiscalObserver {
    override fun executa(notaFiscal: NotaFiscal) {
        println("<-- Nota Fiscal salva no banco de dados")
    }
}
