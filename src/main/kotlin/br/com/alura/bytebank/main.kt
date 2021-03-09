import br.com.alura.bytebank.modelos.Autenticavel
import br.com.alura.bytebank.modelos.Endereco
import br.com.alura.bytebank.modelos.SistemaInterno

fun main() {

//    val endereco = Endereco(logradouro = "rua vergueiro", numero = 3185)
//    val enderecoEmMaiusculo = "${endereco.logradouro}, ${endereco.numero}".toUpperCase()
//    println(enderecoEmMaiusculo)

    val endereco: Endereco = Endereco(logradouro = "rua vergueiro", numero = 3185)

    with(endereco) {
            "$logradouro, $numero".toUpperCase()
        }.let(::println)
    

    listOf(
        Endereco(complemento = "Casa"),
        Endereco(),
        Endereco(complemento = "Apartamento")
    )
        .filter { endereco -> endereco.complemento.isNotEmpty() }
        .let(::println)

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



















