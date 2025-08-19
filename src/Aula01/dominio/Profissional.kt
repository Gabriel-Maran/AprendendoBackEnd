package Aula01.dominio

import Aula01.dominio.enums.Senioridade
import Aula01.dominio.enums.Sexo
import java.math.BigDecimal
import java.util.Optional

class Profissional(
    nome: String,
    idade: Int,
    altura: Double,
    peso: Double,
    sexo: Sexo,
    CPF: String,
    endereco: Endereco,
    var telefone: String,
    var profissao: String,
    var senioridade: Senioridade,
    var habilidade: String,
    var salario: BigDecimal
) : Pessoa(
    nome = nome, idade = idade, altura = altura, peso = peso, sexo = sexo,
    CPF = CPF, endereco = endereco
) {
    var eFormado: Optional<Boolean> = Optional.empty<Boolean>()
    var formação: Optional<String> = Optional.empty<String>()

}