fun testaLacos() {
    var i = 0
    while (i < 2) {
        println("Estrutura While")

        val titular = "Marcelo Felix $i"
        val numeroConta = 1000 + i
        var saldo = i + 10.0

        println("Titular: $titular")
        println("Número da conta: $numeroConta")
        println("Saldo da conta: $saldo")
        println()
        i++
    }

    for (i in 1..3) {
        println("Estrutura for in")
        println(i)
    }

    for (i in 5 downTo 1) {
        if (i == 3) {
            break
        }
        println("Estrutura for in com downTo")
        println(i)
    }

    for (i in 5 downTo 1 step 5) {
        println("Estrutura for in com downTo e step")
        if (i == 4) {
            break
        }
    }
}