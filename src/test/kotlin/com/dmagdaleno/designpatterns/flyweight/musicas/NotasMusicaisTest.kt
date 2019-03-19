package com.dmagdaleno.designpatterns.flyweight.musicas

import org.assertj.core.api.Assertions.assertThat
import org.junit.Test

class NotasMusicaisTest {

    @Test
    fun testaSeObjetosDiferentesUsamAMesmaInstancia() {
        val notasMusicais1 = NotasMusicais()
        val notasMusicais2 = NotasMusicais()

        assertThat(notasMusicais1).isNotSameAs(notasMusicais2)

        assertThat(notasMusicais1.pega("Do")).isSameAs(notasMusicais2.pega("Do"))
        assertThat(notasMusicais1.pega("Re")).isSameAs(notasMusicais2.pega("Re"))
        assertThat(notasMusicais1.pega("Mi")).isSameAs(notasMusicais2.pega("Mi"))
        assertThat(notasMusicais1.pega("Fa")).isSameAs(notasMusicais2.pega("Fa"))
        assertThat(notasMusicais1.pega("Sol")).isSameAs(notasMusicais2.pega("Sol"))
        assertThat(notasMusicais1.pega("La")).isSameAs(notasMusicais2.pega("La"))
        assertThat(notasMusicais1.pega("Si")).isSameAs(notasMusicais2.pega("Si"))

        assertThat(NotasMusicais.counter).isEqualTo(7)
    }
}