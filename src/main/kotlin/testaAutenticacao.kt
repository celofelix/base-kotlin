fun testaAutenticacao() {
    val gerente = Gerente(
        nome = "Alex",
        CPF = "111.222.333-44",
        senha = 123,
        salario = 1000.0
    )

    val diretora = Diretor(
        nome = "Fran",
        CPF = "222.333.444-55",
        salario = 2000.0,
        senha = 1234,
        plr = 200.0
    )

    val sistemaInterno = SistemaInterno()
    sistemaInterno.entra(gerente, 123)
    sistemaInterno.entra(diretora, 1234)
}
