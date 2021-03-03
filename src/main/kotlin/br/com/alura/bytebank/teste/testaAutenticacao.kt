import br.com.alura.bytebank.modelos.Cliente
import br.com.alura.bytebank.modelos.Diretor
import br.com.alura.bytebank.modelos.Gerente
import br.com.alura.bytebank.modelos.SistemaInterno

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
        senha = 123,
        plr = 200.0
    )

    val cliente = Cliente(
        nome = "Gui",
        CPF = "111.222.333-00",
        senha = 123
    )

    val sistemaInterno = SistemaInterno()
    sistemaInterno.entra(gerente, 123)
    sistemaInterno.entra(diretora, 123)
    sistemaInterno.entra(cliente, 123)

}
