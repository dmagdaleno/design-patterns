package com.dmagdaleno.designpatterns.observer.notas

class EmissorNotaFiscal(
    private val notaFiscal: NotaFiscal,
    private val observadores: List<NotaFiscalObserver>) {

    fun emite() {
        println("--> Notificando observadores...")
        atualizaObservadores()
        println("<-- Nota fiscal emitida!")
    }

    private fun atualizaObservadores() {
        observadores.forEach { it.executa(notaFiscal) }
    }
}