package RelembrandoObjetosEEnum.exercicios.coreBancarioSimples.dominio

import java.math.BigDecimal
import java.time.LocalDateTime
import java.util.UUID

class SavingsAccount(
    id: UUID,
    owner: User,
    balance: BigDecimal,
    createdAt: LocalDateTime,
    isActive: Boolean,
    ) :
    Account(id = id, owner = owner, balance = balance, createdAt = createdAt, isActive = isActive
    ) {
    override fun deposit(amount: BigDecimal): Transaction {
        TODO("Not yet implemented")
    }

    override fun withdraw(amount: BigDecimal): Transaction {
        TODO("Not yet implemented")
    }

    override fun changeBalance(amount: BigDecimal) {
        TODO("Not yet implemented")
    }
}