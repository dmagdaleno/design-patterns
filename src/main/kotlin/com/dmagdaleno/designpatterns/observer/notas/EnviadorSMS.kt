package com.dmagdaleno.designpatterns.observer.notas

class EnviadorSMS: NotaFiscalObserver {
    override fun executa(notaFiscal: NotaFiscal) {
        println("<-- SMS enviada")
    }
}
