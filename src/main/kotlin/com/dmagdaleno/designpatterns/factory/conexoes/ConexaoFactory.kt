package com.dmagdaleno.designpatterns.factory.conexoes

import java.sql.Connection
import java.sql.DriverManager
import java.sql.SQLException

class ConnectionFactory {

    companion object {
        fun getConnection(): Connection? {
            return try {

                DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/banco",
                    "usuario",
                    "senha")

            } catch (e: SQLException) {
                println("nenhum driver encontrado")
                null
            }
        }
    }
}