package Aula01.teste

import Aula01.dominio.CaixaDAgua
import java.math.BigDecimal


fun main() {
    val dimensao: Array<Double> = arrayOf(10.0, 15.0, 5.0)
    val caixaDAgua: CaixaDAgua = CaixaDAgua(
        2000, "metal", true, dimensao, 1.5, "MarcaX", "prata", true, BigDecimal("199.99")
    )
    println(caixaDAgua.toString())
}
