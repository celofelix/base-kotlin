fun main() {

    println("Bem vindo ao Bytebank")

    val marcelo = Funcionario(
        nome = "Marcelo",
        CPF = "111.222.333-44",
        salario = 1000.0
    )

    println("Nome: ${marcelo.nome}")
    println("CPF: ${marcelo.CPF}")
    println("Salário: ${marcelo.salario}")
    println("Bonificação: ${marcelo.bonificacao()}")
}