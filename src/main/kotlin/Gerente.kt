class Gerente(
    nome: String,
    CPF: String,
    salario: Double,
    val senha: Int
) : Funcionario(
    nome = nome,
    CPF = CPF,
    salario = salario
) {

    override val bonificacao: Double
        get() {
            return super.bonificacao + salario
        }

    fun autentica(senha: Int): Boolean {
        if (this.senha == senha) {
            return true
        }
        return false
    }

}