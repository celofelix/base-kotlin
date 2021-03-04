package br.com.alura.bytebank.modelos

import br.com.alura.bytebank.exceptions.SaldoInsuficienteException

abstract class Conta(
        val titular: Cliente,
        val numero: Int
) {
    var saldo = 0.0
        protected set

    companion object Contador {
        var total = 0
            private set
    }

    init {
        println("Criando uma conta")
        total++
    }

//    constructor(titular: String, numero: Int) {
//        this.titular = titular
//        this.numero = numero
//    }


    fun deposita(valor: Double) {
        if (valor > 0) {
            this.saldo += valor
        }
    }

    abstract fun saca(valor: Double)

    fun transafere(valor: Double, contaDestino: Conta) {

        if (saldo < valor) {
            throw SaldoInsuficienteException(mensagem = "O saldo é insuficente para o valor de tranferência. " +
                    "Saldo atual: $saldo -> Valor de transferência $valor")
        }
        this.saldo -= valor
        contaDestino.deposita(valor)
    }
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
