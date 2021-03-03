package modelos

class Diretor(
    nome: String,
    CPF: String,
    salario: Double,
    senha: Int,
    val plr: Double
) : FuncionarioAdmin(
    nome = nome,
    CPF = CPF,
    salario = salario,
    senha = senha

) {

    override val bonificacao: Double
        get() {
            return plr + salario
        }
}