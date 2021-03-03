package modelos

abstract class Funcionario(
    val nome: String,
    val CPF: String,
    val salario: Double
) {

    abstract val bonificacao: Double
}