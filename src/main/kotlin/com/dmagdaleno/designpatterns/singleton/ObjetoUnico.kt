package com.dmagdaleno.designpatterns.singleton

class ObjetoUnico private constructor() {

    val atributo: String = "atributo"

    companion object {

        var qtdInstancias: Long = 0

        private var instancia: ObjetoUnico? = null

        private fun criaInstancia(): ObjetoUnico {
            println("criando instancia")
            instancia = ObjetoUnico()
            qtdInstancias++
            return getInstancia()
        }

        fun getInstancia(): ObjetoUnico {
            return synchronized(this){
                instancia ?: criaInstancia()
            }
        }

        fun metodoEstaticoQueNaoPrecisaDeInstancia() = "chamou metodo"

    }
}