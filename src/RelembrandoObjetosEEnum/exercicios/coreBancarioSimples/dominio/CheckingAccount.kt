package RelembrandoObjetosEEnum.exercicios.coreBancarioSimples.dominio

import RelembrandoObjetosEEnum.exercicios.coreBancarioSimples.exception.NotEnoughMoneyException
import RelembrandoObjetosEEnum.exercicios.coreBancarioSimples.exception.WithdrawLimitExceededException
import java.math.BigDecimal
import java.time.LocalDateTime
import java.util.UUID

class CheckingAccount(
    id: UUID,
    owner: User,
    balance: BigDecimal,
    createdAt: LocalDateTime,
    isActive: Boolean,
    var overdraftLimit: BigDecimal
) : Account(id = id, owner = owner, balance = balance, createdAt = createdAt, isActive = isActive) {
    override fun deposit(amount: BigDecimal): Transaction {
        if (amount < BigDecimal.ZERO) {
            throw IllegalArgumentException("Valor de deposito deve ser maior que zero")
        }
        this.balance += amount
        return TODO("Add Transaction return")
    }

    override fun withdraw(amount: BigDecimal): Transaction {
        if (amount <= BigDecimal.ZERO) {
            throw IllegalArgumentException("Valor de saque deve ser maior que zero")
        }
        if (this.balance.add(overdraftLimit) < amount) {
            throw NotEnoughMoneyException()
        }
        this.balance -= amount
        return TODO("Add Transaction return")
    }

    override fun changeBalance(amount: BigDecimal) {
        if(this.overdraftLimit < amount){
            throw WithdrawLimitExceededException()
        }
    }
}