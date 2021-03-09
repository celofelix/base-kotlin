import br.com.alura.bytebank.modelos.Autenticavel
import br.com.alura.bytebank.modelos.Endereco
import br.com.alura.bytebank.modelos.SistemaInterno
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
    )
        .filter { endereco -> endereco.complemento.isNotEmpty() }
        .let(::println)

    soma(5, 5, resultado = {resultado ->
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



















