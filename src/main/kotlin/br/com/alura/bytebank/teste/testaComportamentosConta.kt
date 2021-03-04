import br.com.alura.bytebank.exceptions.SaldoInsuficienteException
import br.com.alura.bytebank.modelos.Cliente
import br.com.alura.bytebank.modelos.ContaCorrente
import br.com.alura.bytebank.modelos.ContaPoupanca

fun testaComportamentosConta() {

    val marcelo = Cliente(nome = "Marcelo", CPF = "", senha = 1)
    val contaMarcelo = ContaCorrente(titular = marcelo, numero = 1000)
    contaMarcelo.deposita(2000.0)

    val fran = Cliente(nome = "Fran", CPF = "", senha = 1)
    val contaFran = ContaPoupanca(numero = 1002, titular = fran)
    contaFran.deposita(1000.0)

    println("<-------------------->")
    println(contaMarcelo.titular)
    println(contaMarcelo.numero)
    println(contaMarcelo.saldo)

    println("Depositando na conta do Marcelo...")
    contaMarcelo.deposita(50.0)
    println("Novo saldo após o depósito ${contaMarcelo.saldo}")
    println("Sacando na conta do Marcelo...")

    contaMarcelo.saca(50.0)
    println("Novo saldo após o saque ${contaMarcelo.saldo}")
    println("Sacando na conta do Marcelo...")

    contaMarcelo.saca(4000.0)
    println("Novo saldo após o saque ${contaMarcelo.saldo}")

    println("<-------------------->")
    println(contaFran.titular)
    println(contaFran.numero)
    println(contaFran.saldo)

    println("Depositando na conta da Fran...")
    contaFran.deposita(50.0)
    println("Novo saldo após o depósito ${contaFran.saldo}")
    println("Sacando na conta da Fran...")

    contaFran.saca(50.0)
    println("Novo saldo após o saque ${contaFran.saldo}")
    println("Transferindo valor da conta da Fran para o Marcelo...")

    try {
    contaFran.transafere(contaDestino = contaMarcelo, valor = 500.0)
        println("Transferência realizada com sucesso")
    } catch (e: SaldoInsuficienteException) {
        println("Falha na transferência")
        println("Saldo insuficiente")
        e.printStackTrace()
    }


    println("Novo saldo conta Fran ${contaFran.saldo}")
    println("Novo saldo conta Marcelo ${contaMarcelo.saldo}")
}
