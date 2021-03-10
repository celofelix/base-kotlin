package br.com.alura.bytebank.teste

import br.com.alura.bytebank.modelos.Autenticavel
import br.com.alura.bytebank.modelos.SistemaInterno

fun testaHighOrderFunction() {

    soma(5, 5, resultado = { resultado ->
        println(resultado)
    })

    somaReceiver(5,5, resultado = {
        println(this)
    })

    val autenticavel = object : Autenticavel {
        val senha = 123
        override fun autentica(senha: Int): Boolean = this.senha == senha
    }

    val sistema = SistemaInterno()
    sistema.entra(autenticavel, 123, autenticado = {
        println("Realizar pagamento")
    })

    sistema.entraReceiver(autenticavel, senha = 123, autenticado = {
        pagamento()
    })
}

fun soma(a: Int, b: Int, resultado: (Int) -> Unit) {
    println("Somando...")
    resultado(a + b)
    println("Soma efetuada")
}

fun somaReceiver(a: Int, b: Int, resultado: Int.() -> Unit) {
    println("Somando...")
    val total = a + b
    total.resultado()
    println("Soma efetuada")
}