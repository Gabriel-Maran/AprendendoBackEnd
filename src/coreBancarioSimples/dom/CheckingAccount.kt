package coreBancarioSimples.dom

import coreBancarioSimples.exception.NotEnoughMoneyException
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
        if (amount <= BigDecimal.ZERO) {
            throw IllegalArgumentException("Valor de deposito deve ser maior que zero")
        }
        changeBalance(amount)
        return TODO("Add Transaction return")
    }

    override fun withdraw(amount: BigDecimal): Transaction {
        if (amount <= BigDecimal.ZERO) {
            throw IllegalArgumentException("Valor de saque deve ser maior que zero")
        }else if (this.balance.add(overdraftLimit) < amount) {
            throw NotEnoughMoneyException()
        }
        changeBalance(amount.negate())
        return TODO("Add Transaction return")
    }

    override fun changeBalance(amount: BigDecimal) {
        this.balance += amount
    }
}