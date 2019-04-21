package com.dmagdaleno.designpatterns.adapter.data

import java.time.LocalDate

interface Relogio {

    fun hoje(): LocalDate
}