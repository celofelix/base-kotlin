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

), Autenticavel {

    override val bonificacao: Double
        get() {
            return plr + salario
        }

    override fun autentica(senha: Int): Boolean {
        if (this.senha == senha) {
            return true
        }
        return false
    }

}