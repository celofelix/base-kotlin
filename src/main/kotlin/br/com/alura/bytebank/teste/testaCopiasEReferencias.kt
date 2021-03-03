import br.com.alura.bytebank.modelos.Cliente
import br.com.alura.bytebank.modelos.ContaCorrente
import br.com.alura.bytebank.modelos.ContaPoupanca

fun testaCopiasEReferencias() {
    val numeroX = 10
    var numeroY = numeroX
    numeroY++

    println("numeroX $numeroX")
    println("numeroY $numeroY")

    val joao = Cliente(nome = "João", CPF = "", senha = 1)
    val contaJoao = ContaCorrente(joao, 1002)

    val maria = Cliente(nome = "Maria", CPF = "", senha = 1)
    val contaMaria = ContaPoupanca(maria, 1003)

    println("br.com.alura.bytebank.modelos.Conta João: ${contaJoao.titular}")
    println("br.com.alura.bytebank.modelos.Conta Maria: ${contaMaria.titular}")
}