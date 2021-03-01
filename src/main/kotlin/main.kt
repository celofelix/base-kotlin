fun main() {

    println("Bem vindo ao Bytebank")

    val contaMarcelo = Conta(titular = "Marcelo",numero =  1000)
    contaMarcelo.deposita(2000.0)

    val contaFran = Conta(numero = 1002, titular = "Fran")
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
    if (contaFran.transafere(contaDestino = contaMarcelo, valor = 100.0)) {
        println("Transferência realizada com sucesso")
    } else {
        println("Não foi possível transferir o valor, saldo insuficiente")
    }

    println("Novo saldo conta Fran ${contaFran.saldo}")
    println("Novo saldo conta Marcelo ${contaMarcelo.saldo}")

}

class Conta(var titular: String, val numero: Int) {
    var saldo = 1.0
        private set

//    constructor(titular: String, numero: Int) {
//        this.titular = titular
//        this.numero = numero
//    }


    fun deposita(valor: Double) {
        if (valor > 0) {
            this.saldo += valor
        }
    }

    fun saca(valor: Double) {
        if (this.saldo >= valor) {
            this.saldo -= valor
        }
    }

    fun transafere(valor: Double, contaDestino: Conta): Boolean {
        if (this.saldo >= valor) {
            this.saldo -= valor
            contaDestino.deposita(valor)
            return true
        }
        return false
    }

//    fun getSaldo(): Double {
//        return saldo
//    }
//
//    fun setSaldo(valor: Double) {
//        if (valor > 0) {
//            this.saldo = valor
//        }
//    }
}

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


fun testaCondicoes(saldo: Double) {

    if (saldo > 0.0) {
        println("Conta está com saldo positivo")
    } else if (saldo == 0.0) {
        println("A conta está com saldo neutro")
    } else {
        println("A conta está com o saldo negativo")
    }

    when {
        saldo > 0.0 -> println("Conta está com saldo positivo")
        saldo == 0.0 -> println("A conta está com saldo neutro")
        else -> println("A conta está com o saldo negativo")
    }
}