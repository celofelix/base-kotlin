import br.com.alura.bytebank.modelos.Endereco
import br.com.alura.bytebank.teste.testaFuncaoAnonima
import br.com.alura.bytebank.teste.testaFuncaoLambda

fun main() {

//    val endereco = Endereco(logradouro = "rua vergueiro", numero = 3185)
//    val enderecoEmMaiusculo = "${endereco.logradouro}, ${endereco.numero}".toUpperCase()
//    println(enderecoEmMaiusculo)

    Endereco(logradouro = "rua vergueiro", numero = 3185).let { endereco ->
        "${endereco.logradouro}, ${endereco.numero}".toUpperCase()
    }.let(::println)

    listOf(
        Endereco(complemento = "Casa"),
        Endereco(),
        Endereco(complemento = "Apartamento")
    ).filter { endereco ->  endereco.complemento.isNotEmpty()}
        .let (::println)

}

















