package com.dmagdaleno.designpatterns.observer.notas

class EnviadorEmail: NotaFiscalObserver {
    override fun executa(notaFiscal: NotaFiscal) {
        println("<-- Email enviado")
    }
}
