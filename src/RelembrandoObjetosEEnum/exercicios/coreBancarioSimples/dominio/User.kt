package RelembrandoObjetosEEnum.exercicios.coreBancarioSimples.dominio

import java.util.UUID

class User(
    val id: UUID,
    val name: String,
    val document: String //CPF ou CNPJ
){

}