package com.dmagdaleno.designpatterns.factory.conexoes

import org.assertj.core.api.Assertions.assertThat
import org.junit.Test

class ConexaoFactoryTest {

    @Test
    fun testaFabricaDeConexoes() {
        val conexao = ConexaoFactory.getConnection()

        assertThat(conexao).isNotNull
    }
}