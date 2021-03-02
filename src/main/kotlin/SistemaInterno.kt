class SistemaInterno {

    fun entra(funcionarioAdmin: FuncionarioAdmin, senha: Int) {
        if(funcionarioAdmin.autentica(senha)) {
            println("Bem vindo ao Bytebank")
        } else {
            println("Senha informada não confere")
        }
    }

}