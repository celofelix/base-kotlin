import br.com.alura.bytebank.modelos.Cliente
import br.com.alura.bytebank.modelos.ContaPoupanca
import br.com.alura.bytebank.modelos.Endereco
import br.com.alura.bytebank.teste.testaHighOrderFunction

fun main() {

    testaHighOrderFunction()

}

fun testaFuncaoRun() {
    val taxaAnual = 0.05
    val taxaMensal = taxaAnual / 12
    println("Taxa  mensal $taxaMensal")

    val contaPoupanca = ContaPoupanca(
        Cliente(nome = "Alex", CPF = "111.222.333-44", senha = 1234),
        1000
    )

    contaPoupanca.run {
        deposita(1000.0)
        println("Saldo  $saldo")
        saldo * taxaMensal
    }.let { rendimentoMensal ->
        println("Rendimento mensal: $rendimentoMensal")
    }

    val rendimentoAnual = run {
        var saldo = contaPoupanca.saldo
        repeat(12) {
            saldo += saldo * taxaMensal
        }
        saldo
    }
    println("Simulação rendimento Anual $rendimentoAnual")
}

fun testaFuncaoWith() {
    with(Endereco()) {
        logradouro = "rua vergueiro"
        numero = 3185
        bairro = "Vila Mariana"
        cidade = "São Paulo"
        estado = "SP"
        cep = "02832-000"
        cidade = "Apartamento"
        completo()
    }.let { enderecoCompleto ->
        println(enderecoCompleto)
    }
}























