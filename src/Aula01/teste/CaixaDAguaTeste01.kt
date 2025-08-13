package Aula01.teste

import Aula01.dominio.*
import java.math.BigDecimal
import java.time.LocalDate


fun main() {
    val profissional: Profissional =Profissional(
        nome = "Gabriel", idade = 18, altura = 1.93, peso = 86.5, sexo = Sexo.Masculino, telefone = "(49)9999-9999", profissao = "Programador",
        CPF = "000.000.000-00", senioridade = Senioridade.JUNIOR, habilidade = "Pensamento critico, raciciocinio logico....", salario = BigDecimal("9999.99"),
        endereco = Endereco("Rua Sei La", 100, "Casa")
    )
    val caixaDAgua: CaixaDAgua = CaixaDAgua(
        capacidade = 2000, material = "metal", interno =  true,dimensao = arrayOf(10.0, 15.0, 5.0), peso = 1.5,
        marca = "MarcaX", cor ="prata", tampa = true, preco =  BigDecimal("199.99")
    )
    val instalacao:Servico = Servico(
        responsaveis = arrayOf(profissional), preco = BigDecimal("500.00"), tipo = "Adicionar verificação de duas etapas",
        dataInicioPrevista = LocalDate.of(2025, 8, 13), dataFimPrevista = LocalDate.of(2025, 8, 21),
        trabalhaSeChover = true, expediente = 8
    )
}
