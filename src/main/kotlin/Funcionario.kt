open class Funcionario(
    val nome: String,
    val CPF: String,
    val salario: Double
) {

    open val bonificacao: Double
        get() {
            return salario * 0.1
        }

}