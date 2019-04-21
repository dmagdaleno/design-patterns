package com.dmagdaleno.designpatterns.adapter.data

import org.assertj.core.api.Assertions.assertThat
import org.junit.Test
import java.time.LocalDate

class RelogioTest {

    @Test
    fun deveTrazerDataAtual() {
        val relogio: Relogio = RelogioDoSistema()

        assertThat(relogio.hoje()).isEqualTo(LocalDate.now())
    }
}