package br.com.alura.bytebank

import br.com.alura.bytebank.modelos.Autenticavel

fun testaExpressionObject() {
    val fran = object : Autenticavel {
        val nome = "Fran"
        val cpf = "123.456.789-00"
        val senha = 123

        override fun autentica(senha: Int) = this.senha == senha
    }
}