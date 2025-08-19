package Aula01.dominio

import Aula01.dominio.enums.Sexo

class Cliente(
    CPF: String,
    nome: String,
    idade: Int,
    altura: Double,
    peso: Double,
    sexo: Sexo,
    endereco: Endereco,
    var telefone: String,
    var email: String
) : Pessoa(
    CPF = CPF, nome = nome, idade = idade, altura = altura,
    peso = peso, sexo = sexo, endereco = endereco
) {
    var listaCompras: MutableList<String> = mutableListOf()

    fun compra(item: String) {
        listaCompras.add(item)
    }
}