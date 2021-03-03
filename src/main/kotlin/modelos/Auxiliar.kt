package modelos

import modelos.Funcionario

class Auxiliar(
    nome: String,
    CPF: String,
    salario: Double
) : Funcionario(
    nome = nome,
    CPF = CPF,
    salario = salario
) {
    override val bonificacao: Double
        get() = salario * 0.5

}