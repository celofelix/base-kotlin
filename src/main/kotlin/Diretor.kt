class Diretor(
    nome: String,
    CPF: String,
    salario: Double,
    val senha: Int,
    val plr: Double
) : Funcionario(
    nome = nome,
    CPF = CPF,
    salario = salario
) {

    override val bonificacao: Double
        get() {
            return super.bonificacao + plr + salario
        }

    fun autentica(senha: Int): Boolean {
        if (this.senha == senha) {
            return true
        }
        return false
    }

}