class Gerente(
    nome: String,
    CPF: String,
    salario: Double,
    senha: Int
) : FuncionarioAdmin(
    nome = nome,
    CPF = CPF,
    salario = salario,
    senha = senha
) {

    override val bonificacao: Double
        get() {
            return salario
        }

    override fun autentica(senha: Int): Boolean {
        if (this.senha == senha) {
            return true
        }
        return false
    }

}