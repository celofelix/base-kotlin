fun testaCopiasEReferencias() {
    val numeroX = 10
    var numeroY = numeroX
    numeroY++

    println("numeroX $numeroX")
    println("numeroY $numeroY")

    val contaJoao = Conta("João", 1002)
    val contaMaria = Conta("Maria", 1003)

    println("Conta João: ${contaJoao.titular}")
    println("Conta Maria: ${contaMaria.titular}")
}