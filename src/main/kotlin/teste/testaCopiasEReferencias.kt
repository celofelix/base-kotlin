import modelos.ContaCorrente
import modelos.ContaPoupanca

fun testaCopiasEReferencias() {
    val numeroX = 10
    var numeroY = numeroX
    numeroY++

    println("numeroX $numeroX")
    println("numeroY $numeroY")

    val contaJoao = ContaCorrente("João", 1002)
    val contaMaria = ContaPoupanca("Maria", 1003)

    println("modelos.Conta João: ${contaJoao.titular}")
    println("modelos.Conta Maria: ${contaMaria.titular}")
}