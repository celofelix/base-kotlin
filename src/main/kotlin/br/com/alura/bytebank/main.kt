import br.com.alura.bytebank.modelos.Endereco

fun main() {

    var enderecoNulo: Endereco? = Endereco(logradouro = "Rua não nula")
    
    val logradouroNovo: String? = enderecoNulo?.logradouro
    println(logradouroNovo?.length)

    enderecoNulo?.let {it ->
        println(it.logradouro.length)
    }

//    Testando uma variavel com tipo e tornando ela como Nullable para aceitar valor null
//    var enderecoNulo: Endereco? = null
//    Usando o operador assert non-null !!.
//    Dessa forma estamos garantindo que a variavel que está sendo atribuída não é nulla
//    Mas como nesse caso ela está nulla o programa irá quebrar
//    val enderecoNaoNulo: Endereco = enderecoNulo!!
//    println("${enderecoNaoNulo.logradouro}")
}












