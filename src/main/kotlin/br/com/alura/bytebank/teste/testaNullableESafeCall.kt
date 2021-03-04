package br.com.alura.bytebank.teste

import br.com.alura.bytebank.modelos.Endereco

fun testaNullableESafeCall() {
    var enderecoNulo: Endereco? = Endereco(logradouro = "Rua não nula", complemento = "Prédio")

    val logradouroNovo: String? = enderecoNulo?.logradouro
    println(logradouroNovo?.length)

    enderecoNulo.let {
        println(it?.logradouro?.length)
        val tamanhoComplemento: Int = it?.complemento?.length
                ?: throw IllegalStateException("Complemento não deve ser preenchido")
        println(tamanhoComplemento)
    }

    enderecoNulo?.let { it ->
        println(it.logradouro.length)
    }

    enderecoNulo?.let { endereco ->
        println(endereco.logradouro.length)
    }

    teste("")

//    Testando uma variavel com tipo e tornando ela como Nullable para aceitar valor null
//    var enderecoNulo: Endereco? = null
//    Usando o operador assert non-null !!.
//    Dessa forma estamos garantindo que a variavel que está sendo atribuída não é nulla
//    Mas como nesse caso ela está nulla o programa irá quebrar
//    val enderecoNaoNulo: Endereco = enderecoNulo!!
//    println("${enderecoNaoNulo.logradouro}")
}

fun teste(valor: Any) {
    val numero: Int? = valor as? Int
    println(numero)
}
