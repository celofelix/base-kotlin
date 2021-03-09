import br.com.alura.bytebank.teste.testaNullableESafeCall

fun main() {

    val minhaFuncaoLambda: () -> Unit = {
        println("Executa como lambda")
    }
    println("Função Lambda: ${minhaFuncaoLambda()}")

    val minhaFuncaoAnonima: () -> Unit = fun() {
        println("Excuta Função anonima")
    }
    println("Função anonima: ${minhaFuncaoAnonima()}")
}

fun testaFuncaoClasse() {
    val minhaFuncaoClasse: () -> Unit = Teste()
    println(minhaFuncaoClasse())
}

fun testaFuncaoReferencia() {
    val adicao: (Int, Int) -> Int = ::soma
    println(adicao)
    val total = adicao(3, 5)
    println(total)

    val funcaoTeste: () -> Unit = ::teste
    println(funcaoTeste())
}

fun teste() {
    println("Executa função teste")
}

fun soma(a: Int, b: Int): Int = a + b

class Teste: () -> Unit {
    override fun invoke() {
        println("Executa invoke da classe Teste")
    }

}















