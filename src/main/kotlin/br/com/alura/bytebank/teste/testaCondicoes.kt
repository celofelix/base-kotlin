fun testaCondicoes(saldo: Double) {

    if (saldo > 0.0) {
        println("br.com.alura.bytebank.modelos.Conta está com saldo positivo")
    } else if (saldo == 0.0) {
        println("A conta está com saldo neutro")
    } else {
        println("A conta está com o saldo negativo")
    }

    when {
        saldo > 0.0 -> println("br.com.alura.bytebank.modelos.Conta está com saldo positivo")
        saldo == 0.0 -> println("A conta está com saldo neutro")
        else -> println("A conta está com o saldo negativo")
    }
}