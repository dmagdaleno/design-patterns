package com.dmagdaleno.designpatterns.templatemethod.relatorios

import org.assertj.core.api.Assertions.assertThat
import org.junit.Test
import java.time.LocalDate

class RelatoriosTest {

    @Test
    fun testaRelatorioSimples(){
        // dado que...
        val banco = criaBanco()
        val conta = criaConta()

        // quando...
        val relatorio = RelatorioSimples().imprime(banco, conta)

        val relatorioEsperado = """
            Banco: Banco Now

            Titular: João da Silva, Saldo: 1000.0

            Tel.: +55 (11) 4444-5555
        """.trimIndent()

        // entao...
        assertThat(relatorio).isEqualTo(relatorioEsperado)
        assertThat(relatorio).doesNotContain(banco.email, banco.endereco, "${conta.id}", "${conta.idAgencia}")
    }

    @Test
    fun testaRelatorioComplexo(){
        // dado que...
        val banco = criaBanco()
        val conta = criaConta()
        val dataAtual = LocalDate.now()

        // quando...
        val relatorio = RelatorioComplexo().imprime(banco, conta)

        val relatorioEsperado = """
            Banco: Banco Now, End.: Rua do Banco Now, 23, Tel.: +55 (11) 4444-5555

            Agência: 123, Conta: 1234, Titular: João da Silva, Saldo: 1000.0

            Email: gerente@banconow.com, $dataAtual
        """.trimIndent()

        // entao...
        assertThat(relatorio).isEqualTo(relatorioEsperado)
    }

    private fun criaBanco(): Banco {
        val nomeBanco = "Banco Now"
        val enderecoBanco = "Rua do Banco Now, 23"
        val telefoneBanco = "+55 (11) 4444-5555"
        val emailBanco = "gerente@banconow.com"
        val banco = Banco(nomeBanco, enderecoBanco, telefoneBanco, emailBanco)
        return banco
    }

    private fun criaConta(): Conta {
        val nomeTitular = "João da Silva"
        val idAgencia = 123
        val idConta = 1234
        val saldo = 1000.0
        val conta = Conta(idConta, idAgencia, nomeTitular, saldo)
        return conta
    }
}