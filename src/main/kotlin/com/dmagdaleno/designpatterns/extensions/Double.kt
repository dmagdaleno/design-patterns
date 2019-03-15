package com.dmagdaleno.designpatterns.extensions

import java.math.BigDecimal

fun Double.arredonda(casasDecimais: Int) = this.toBigDecimal().setScale(casasDecimais, BigDecimal.ROUND_HALF_EVEN).toDouble()