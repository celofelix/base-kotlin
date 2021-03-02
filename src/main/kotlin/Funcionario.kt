class Funcionario(
    val nome: String,
    val CPF: String,
    val salario: Double
) {

    fun bonificacao(): Double {
        return salario * 0.1
    }

}