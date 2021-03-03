import br.com.alura.bytebank.modelos.Cliente
import br.com.alura.bytebank.modelos.ContaCorrente
import br.com.alura.bytebank.modelos.ContaPoupanca
import br.com.alura.bytebank.modelos.totalContas


fun main() {


    val alex = Cliente(nome = "Alex", CPF = "", senha = 1)
    val contaPoupanca = ContaPoupanca(titular = alex, numero = 1)
    val contaCorrente = ContaCorrente(titular = alex, numero = 2)

    testaContasDiferentes()

    println("Total de contas: ${totalContas}")

}



