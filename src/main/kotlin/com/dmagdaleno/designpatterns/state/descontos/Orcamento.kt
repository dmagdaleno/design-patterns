package com.dmagdaleno.designpatterns.state.descontos

data class Orcamento(private val valorInicial: Double) {

    var valor = valorInicial
        private set

    var estado: EstadoOrcamento = EmAprovacao()
        private set

    fun aplicaDesconto() {
        estado.aplicaDesconto(this)
    }

    fun aprova() {
        estado.aprova(this)
    }

    fun reprova() {
        estado.reprova(this)
    }

    fun finaliza() {
        estado.finaliza(this)
    }

    private class EmAprovacao: EstadoOrcamento {
        private val descricao = "EM_APROVACAO"

        override fun aplicaDesconto(orcamento: Orcamento) {
            orcamento.valor = orcamento.valor * 0.95
        }

        override fun aprova(orcamento: Orcamento) {
            orcamento.estado = Aprovado()
        }

        override fun reprova(orcamento: Orcamento) {
            orcamento.estado = Reprovado()
        }

        override fun finaliza(orcamento: Orcamento) {
            orcamento.estado = Finalizado()
        }

        override fun toString() = descricao
    }

    private class Aprovado: EstadoOrcamento {
        private val descricao = "APROVADO"

        override fun aplicaDesconto(orcamento: Orcamento) {
            orcamento.valor = orcamento.valor * 0.98
        }

        override fun aprova(orcamento: Orcamento) {
            throw IllegalStateException("O orçamento já foi aprovado")
        }

        override fun reprova(orcamento: Orcamento) {
            throw IllegalStateException("O orçamento já foi aprovado")
        }

        override fun finaliza(orcamento: Orcamento) {
            orcamento.estado = Finalizado()
        }

        override fun toString() = descricao
    }

    private class Reprovado: EstadoOrcamento {
        private val descricao = "REPROVADO"

        override fun aplicaDesconto(orcamento: Orcamento) {
            throw IllegalStateException("Não é possível aplicar descontos para orçamentos reprovados")
        }

        override fun aprova(orcamento: Orcamento) {
            throw IllegalStateException("Não é possível mudar o estado de orçamentos finalizados")
        }

        override fun reprova(orcamento: Orcamento) {
            throw IllegalStateException("Não é possível mudar o estado de orçamentos finalizados")
        }

        override fun finaliza(orcamento: Orcamento) {
            orcamento.estado = Finalizado()
        }

        override fun toString() = descricao
    }

    private class Finalizado: EstadoOrcamento {
        private val descricao = "FINALIZADO"

        override fun aplicaDesconto(orcamento: Orcamento) {
            throw IllegalStateException("Não é possível aplicar descontos para orçamentos finalizados")
        }

        override fun aprova(orcamento: Orcamento) {
            throw IllegalStateException("Não é possível mudar o estado de orçamentos finalizados")
        }

        override fun reprova(orcamento: Orcamento) {
            throw IllegalStateException("Não é possível mudar o estado de orçamentos finalizados")
        }

        override fun finaliza(orcamento: Orcamento) {
            throw IllegalStateException("Não é possível mudar o estado de orçamentos finalizados")
        }

        override fun toString() = descricao
    }
}