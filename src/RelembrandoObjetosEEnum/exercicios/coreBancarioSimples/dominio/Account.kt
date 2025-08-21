package RelembrandoObjetosEEnum.exercicios.coreBancarioSimples.dominio

import java.math.BigDecimal
import java.time.LocalDate
import java.time.LocalDateTime
import java.util.UUID

abstract class Account (
    val id: UUID,
    var owner: User,
    var balance: BigDecimal,
    val createdAt: LocalDateTime,
    var isActive: Boolean
){
    abstract fun deposit(amount: BigDecimal): Transaction
    abstract fun withdraw(amount: BigDecimal): Transaction
    protected abstract fun changeBalance(amount: BigDecimal)

    fun closeAccount(activite: Boolean){
        isActive = activite
    }

}