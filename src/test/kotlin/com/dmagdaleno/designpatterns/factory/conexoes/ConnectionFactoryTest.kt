package com.dmagdaleno.designpatterns.factory.conexoes

import org.assertj.core.api.Assertions.assertThat
import org.junit.Test

class ConnectionFactoryTest {

    @Test
    fun testaFabricaDeConexoes() {
        val conexao = ConnectionFactory.getConnection()

        assertThat(conexao).isNull()
    }
}