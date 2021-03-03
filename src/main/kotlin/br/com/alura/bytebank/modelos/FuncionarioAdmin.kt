package br.com.alura.bytebank.modelos

abstract class FuncionarioAdmin(
    nome: String,
    CPF: String,
    salario: Double,
    protected val senha: Int
) : Funcionario(
    nome = nome,
    CPF = CPF,
    salario = salario
), Autenticavel {
    override fun autentica(senha: Int): Boolean {
        if (this.senha == senha) {
            return true
        }
        return false
    }

}