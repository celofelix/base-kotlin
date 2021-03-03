package modelos

class Analista(
    nome: String,
    CPF: String,
    salario: Double
) : Funcionario(
    nome = nome,
    CPF = CPF,
    salario = salario
) {

    override val bonificacao: Double
        get() {
            return salario * 0.1
        }
}