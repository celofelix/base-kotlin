package br.com.alura.bytebank.teste

import br.com.alura.bytebank.modelos.Endereco

fun testaFuncaoWith() {
    with(Endereco()) {
        logradouro = "rua vergueiro"
        numero = 3185
        bairro = "Vila Mariana"
        cidade = "São Paulo"
        estado = "SP"
        cep = "02832-000"
        cidade = "Apartamento"
        completo()
    }.let { enderecoCompleto ->
        println(enderecoCompleto)
    }
}
