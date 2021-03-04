package br.com.alura.bytebank.teste

import java.lang.NumberFormatException

fun testaTryEIfExpression() {
    val entrada: String = "1.0"
    val valorRecebido: Double? = try {
        entrada.toDouble()
    } catch (e: NumberFormatException) {
        null
    }

    val valorComTaxa: Double? = if (valorRecebido != null) {
        valorRecebido + 0.1
    } else {
        null
    }

    if (valorComTaxa != null) {
        println("Valor recebido $valorComTaxa")
    } else {
        println("Valor informado inválido")
    }
}
