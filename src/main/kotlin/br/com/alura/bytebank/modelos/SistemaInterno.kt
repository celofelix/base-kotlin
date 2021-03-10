package br.com.alura.bytebank.modelos

class SistemaInterno {

    fun entra(admin: Autenticavel, senha: Int, autenticado: () -> Unit = {}) {
        if(admin.autentica(senha)) {
            println("Bem vindo ao Bytebank")
            autenticado()
        } else {
            println("Senha informada não confere")
        }
    }

    fun entraReceiver(admin: Autenticavel, senha: Int, autenticado: SistemaInterno.() -> Unit = {}) {
        if(admin.autentica(senha)) {
            println("Bem vindo ao Bytebank")
            autenticado()
        } else {
            println("Senha informada não confere")
        }
    }

    fun pagamento() {
        println("Realizando pagamento...")
    }


}