package com.dmagdaleno.designpatterns.flyweight.musicas

import kotlin.reflect.full.createInstance

class NotasMusicais {

    companion object {

        var counter = 0

        private var notas: MutableMap<String, NotaMusical> = mutableMapOf()

        private val classes = listOf(Do::class, Re::class, Mi::class, Fa::class, Sol::class, La::class, Si::class)
    }

    fun pega(nota: String): NotaMusical = notas[nota] ?: instanciaNovaNota(nota)

    private fun instanciaNovaNota(nota: String): NotaMusical {
        counter++
        val c = classes.firstOrNull { it.simpleName == nota } ?: throw IllegalArgumentException("Nota inválida")
        val instancia = c.createInstance()
        notas[nota] = instancia
        return instancia
    }
}