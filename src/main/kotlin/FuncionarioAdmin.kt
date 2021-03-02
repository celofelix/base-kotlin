abstract class FuncionarioAdmin(
    nome: String,
    CPF: String,
    salario: Double,
    val senha: Int
) : Funcionario(
    nome = nome,
    CPF = CPF,
    salario = salario
) {
    open fun autentica(senha: Int): Boolean {
        if (this.senha == senha) {
            return true
        }
        return false
    }

}