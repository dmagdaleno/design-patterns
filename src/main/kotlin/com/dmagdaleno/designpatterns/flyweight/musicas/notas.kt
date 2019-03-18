package com.dmagdaleno.designpatterns.flyweight.musicas 

class Do: NotaMusical {
    override fun toca(): String {
        val nota = "Do"
        println(nota)
        return nota
    }
}

class Re: NotaMusical {
    override fun toca(): String {
        val nota = "Re"
        println(nota)
        return nota
    }
}

class Mi: NotaMusical {
    override fun toca(): String {
        val nota = "Mi"
        println(nota)
        return nota
    }
}

class Fa: NotaMusical {
    override fun toca(): String {
        val nota = "Fa"
        println(nota)
        return nota
    }
}

class Sol: NotaMusical {
    override fun toca(): String {
        val nota = "Sol"
        println(nota)
        return nota
    }
}

class La: NotaMusical {
    override fun toca(): String {
        val nota = "La"
        println(nota)
        return nota
    }
}

class Si: NotaMusical {
    override fun toca(): String {
        val nota = "Si"
        println(nota)
        return nota
    }
}
