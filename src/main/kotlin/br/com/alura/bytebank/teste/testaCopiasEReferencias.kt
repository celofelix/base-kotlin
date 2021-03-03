import br.com.alura.bytebank.modelos.ContaCorrente
import br.com.alura.bytebank.modelos.ContaPoupanca

fun testaCopiasEReferencias() {
    val numeroX = 10
    var numeroY = numeroX
    numeroY++

    println("numeroX $numeroX")
    println("numeroY $numeroY")

    val contaJoao = ContaCorrente("João", 1002)
    val contaMaria = ContaPoupanca("Maria", 1003)

    println("br.com.alura.bytebank.modelos.Conta João: ${contaJoao.titular}")
    println("br.com.alura.bytebank.modelos.Conta Maria: ${contaMaria.titular}")
}