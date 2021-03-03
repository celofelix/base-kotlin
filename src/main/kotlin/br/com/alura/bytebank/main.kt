import br.com.alura.bytebank.modelos.*


fun main() {

    val fran = object : Autenticavel {
        val nome = "Fran"
        val cpf = "123.456.789-00"
        val senha = 123

        override fun autentica (senha: Int) = this.senha == senha
    }

    val alex = Cliente(nome = "Alex", CPF = "", senha = 1)
    val contaPoupanca = ContaPoupanca(titular = alex, numero = 1)
    val contaCorrente = ContaCorrente(titular = alex, numero = 2)

    testaContasDiferentes()

    val sistemaInterno = SistemaInterno()
    sistemaInterno.entra(fran, 123)
    println("Object expression ${fran.nome}")
    println("Total de contas: ${totalContas}")



}



