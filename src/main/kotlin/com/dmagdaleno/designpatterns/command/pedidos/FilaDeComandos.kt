package com.dmagdaleno.designpatterns.command.pedidos

class FilaDeComandos {

    private val comandos: MutableCollection<Comando> = mutableListOf()

    fun adicionaComando(comando: Comando) {
        comandos.add(comando)
    }

    fun processa() {
        comandos.forEach { it.executa() }
    }

}
