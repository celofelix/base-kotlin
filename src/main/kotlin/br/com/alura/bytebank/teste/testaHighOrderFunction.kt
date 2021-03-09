package br.com.alura.bytebank.teste

import br.com.alura.bytebank.modelos.Autenticavel
import br.com.alura.bytebank.modelos.SistemaInterno

fun testaHighOrderFunction() {

    soma(5, 5, resultado = { resultado ->
        println(resultado)
    })

    val autenticavel = object : Autenticavel {
        val senha = 123
        override fun autentica(senha: Int): Boolean = this.senha == senha
    }

    SistemaInterno().entra(autenticavel, 123, autenticado = {
        println("Realizar pagamento")
    })
}

fun soma(a: Int, b: Int, resultado: (Int) -> Unit) {
    println("Somando...")
    resultado(a + b)
    println("Soma efetuada")
}