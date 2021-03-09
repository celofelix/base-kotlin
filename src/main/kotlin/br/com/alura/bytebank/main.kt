fun main() {

    val minhaFuncaoLambda: (Int, Int) -> Int = { a, b ->
        a + b
    }
    println("Executando Função Lambda: ${minhaFuncaoLambda(5, 5)}")

    val minhaFuncaoAnonima: (Int, Int) -> Int = fun(a, b): Int {
        return a + b
    }
    println("Função anonima: ${minhaFuncaoAnonima(5, 5)}")

    val calculaBonificacao: (salario: Double) -> Double = lambda@{ salario ->
        if (salario > 1000.0) {
            return@lambda salario + 50.0
        }
        return@lambda salario + 100.0
    }

    println("Função Lambda com multiplos retornos: ${calculaBonificacao(1500.0)}")

    val calculaBonificacaoAnonima: (salario: Double) -> Double = fun(salario): Double {
        if(salario > 1000.0) {
            return salario + 50.0
        }
        return salario + 100.0
    }

    println("Função anônima com multiplos retornos: ${calculaBonificacaoAnonima(1500.0)}")
}

fun testaFuncaoClasse() {
    val minhaFuncaoClasse: (Int, Int) -> Int = Teste()
    println("Executa teste Função Classe: ${minhaFuncaoClasse(5, 5)}")
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

class Teste : (Int, Int) -> Int {
    override fun invoke(valor1: Int, valor2: Int): Int {
        return valor1 + valor2
    }

}















