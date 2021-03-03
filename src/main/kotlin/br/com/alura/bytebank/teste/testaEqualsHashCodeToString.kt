package br.com.alura.bytebank.teste

import br.com.alura.bytebank.modelos.Endereco

fun testaEqualsHashCodeToString() {
    val endereco = Endereco(logradouro = "Rua Teste 1", cep = "06361290")
    val enderecoNovo = Endereco(logradouro = "Rua Teste 2", cep = "06361290")
    println("Teste do equals: ${endereco.equals(enderecoNovo)}")

    println(endereco.hashCode())
    println(enderecoNovo.hashCode())

    println(endereco.toString())
    println(enderecoNovo.toString())
}
