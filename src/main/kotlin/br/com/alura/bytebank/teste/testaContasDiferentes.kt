import br.com.alura.bytebank.modelos.Cliente
import br.com.alura.bytebank.modelos.ContaCorrente
import br.com.alura.bytebank.modelos.ContaPoupanca
import br.com.alura.bytebank.modelos.Endereco

fun testaContasDiferentes() {
    val contaCorrente = ContaCorrente(
        titular = Cliente(nome = "Alex", CPF = "111.222.333-44", senha = 1,
            endereco = Endereco(logradouro = "Rua 2")
        ),
        numero = 1000
    )

    val contaPoupanca = ContaPoupanca(
        titular = Cliente(nome = "Fran", CPF = "", senha = 1),
        numero = 1001
    )

    println("Conta")
    println("Nome do titular: ${contaCorrente.titular.nome}")
    println("CPF do titular: ${contaCorrente.titular.CPF}")
    println("CPF do titular: ${contaCorrente.titular.endereco.logradouro}")

    contaCorrente.deposita(1000.0)
    contaPoupanca.deposita(1000.0)

    println("Saldo conta corrente: ${contaCorrente.saldo}")
    println("Saldo conta poupança: ${contaPoupanca.saldo}")

    contaCorrente.saca(100.0)
    contaPoupanca.saca(100.0)

    println("Saldo conta corrente após saque ${contaCorrente.saldo}")
    println("Saldo conta poupança após saque ${contaPoupanca.saldo}")

    contaCorrente.transafere(100.0, contaPoupanca)

    println("Saldo conta corrente após transferência: ${contaCorrente.saldo}")
    println("Saldo conta poupança após receber transferência: ${contaPoupanca.saldo}")

    contaPoupanca.transafere(100.0, contaCorrente)

    println("Saldo conta poupança após transferência: ${contaPoupanca.saldo}")
    println("Saldo conta corrente após receber transferência: ${contaCorrente.saldo}")
}
