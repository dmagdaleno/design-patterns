package com.dmagdaleno.designpatterns.factory.conexoes

class ConexaoFactory {

    companion object {
        fun getConnection() = Conexao("jdbc:mysql://localhost:3306/banco", "usuario", "senha")
    }
}