package br.com.alura.bytebank.teste

import br.com.alura.bytebank.modelos.Endereco

fun testaFuncoesEscopo() {
    //    val endereco = Endereco(logradouro = "rua vergueiro", numero = 3185)
//    val enderecoEmMaiusculo = "${endereco.logradouro}, ${endereco.numero}".toUpperCase()
//    println(enderecoEmMaiusculo)

    val endereco: Endereco = Endereco()
    endereco.apply {
        logradouro = "rua vergueiro"
        numero = 3185
    }

    with(endereco) {
        "$logradouro, $numero".toUpperCase()
    }.let(::println)


    listOf(
        Endereco(complemento = "Casa"),
        Endereco(),
        Endereco(complemento = "Apartamento")
    )
        .filter { enderecoComComplemento -> enderecoComComplemento.complemento.isNotEmpty() }
        .let(::println)
}