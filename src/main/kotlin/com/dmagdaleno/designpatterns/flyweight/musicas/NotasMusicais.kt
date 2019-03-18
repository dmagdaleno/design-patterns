package com.dmagdaleno.designpatterns.flyweight.musicas

class NotasMusicais {

    companion object {

        private val notas: Map<String, NotaMusical> =
            mapOf(
                "Do"  to  Do(),
                "Re"  to  Re(),
                "Mi"  to  Mi(),
                "Fa"  to  Fa(),
                "Sol" to  Sol(),
                "La"  to  La(),
                "Si"  to  Si()
            )
    }

    fun pega(nota: String): NotaMusical = notas[nota] ?: throw IllegalArgumentException("Nota inválida")
}