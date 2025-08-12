package Aula01.dominio

import java.math.BigDecimal
import java.time.LocalDate

class Servico(
    var responsaveis: Array<String> = arrayOf(""),
    var preco: BigDecimal = BigDecimal.ZERO,
    var tipo: String = "",
    var dataInicioPrevista: LocalDate = LocalDate.of(0, 0, 0),
    var dataFimPrevista: LocalDate = LocalDate.of(0, 0, 0),
    var trabalhaSeChover: Boolean = false,
    var expediente: Int = 0, //horas
) {
    var dataInicioReal: LocalDate = LocalDate.of(0, 0, 0)
    var dataFimReal: LocalDate = LocalDate.of(0, 0, 0)
}