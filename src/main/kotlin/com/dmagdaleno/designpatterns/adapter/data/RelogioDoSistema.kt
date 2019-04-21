package com.dmagdaleno.designpatterns.adapter.data

import java.time.LocalDate

class RelogioDoSistema : Relogio {

    override fun hoje(): LocalDate {
        return LocalDate.now()
    }
}