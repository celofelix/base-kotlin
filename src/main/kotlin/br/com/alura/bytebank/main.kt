import br.com.alura.bytebank.modelos.Endereco

fun main() {

    var enderecoNulo: Endereco? = null
    val enderecoNaoNulo: Endereco = enderecoNulo!!
    println("${enderecoNaoNulo.logradouro}")
}












