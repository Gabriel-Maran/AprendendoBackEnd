package Aula01.dominio

open class Pessoa(
    var CPF: String,
    var nome: String,
    var idade: Int,
    var altura: Double,
    var peso: Double,
    var sexo: Sexo,
    var endereco: Endereco
) {
    fun imc(): Double {
        return peso / (altura * altura)
    }
}