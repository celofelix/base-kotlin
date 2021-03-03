import br.com.alura.bytebank.modelos.Endereco

fun main() {

    val endereco = Endereco(logradouro = "Rua Teste 1")
    val enderecoNovo = Endereco(logradouro = "Rua Teste 2")
    println(endereco.equals(enderecoNovo))

    println(endereco.hashCode())
    println(enderecoNovo.hashCode())

    println(endereco.toString())
    println(enderecoNovo.toString())
}

fun imprime(valor: Any) {
    println(valor)
}






