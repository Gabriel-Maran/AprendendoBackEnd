package Aula01.dominio

import java.math.BigDecimal

class CaixaDAgua(
    val capacidade: Int,
    var material: String,
    var interno: Boolean,
    var dimensao: Array<Double>,
    var peso: Double,
    var marca: String,
    var cor: String,
    var tampa: Boolean,
    var preco: BigDecimal,
) {
    override fun toString(): String {
        return "CaixaDAgua(capacidade=$capacidade, material='$material', interno=$interno, dimensao=${dimensao.contentToString()}, peso=$peso, marca='$marca', cor='$cor', tampa=$tampa, preco=$preco)"
    }
}