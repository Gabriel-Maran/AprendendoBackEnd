package coreBancarioSimples.dom

import coreBancarioSimples.enums.InterestType
import coreBancarioSimples.exception.NotEnoughMoneyException
import coreBancarioSimples.exception.WithdrawLimitExceededException
import java.math.BigDecimal
import java.math.MathContext
import java.time.LocalDateTime
import java.time.Period
import java.util.UUID
import kotlin.math.pow

class SavingsAccount(
    id: UUID,
    owner: User,
    balance: BigDecimal,
    createdAt: LocalDateTime,
    isActive: Boolean,
    var monthlyWithdrawalLimit: Int,
    var withdrawalsThisMonth: Int,
    var interestRateDays: BigDecimal
) :
    Account(
        id = id, owner = owner, balance = balance, createdAt = createdAt, isActive = isActive
    ) {
    override fun deposit(amount: BigDecimal): Transaction {
        if (amount <= BigDecimal.ZERO) {
            throw IllegalArgumentException("O valor de desposito deve ser maior que zero")
        }
        changeBalance(amount)
        return TODO("Transaction will be implemented")
    }

    override fun withdraw(amount: BigDecimal): Transaction {
        if (amount <= BigDecimal.ZERO) {
            throw IllegalArgumentException("O valor de saque deve ser maior que zero")
        } else if (this.withdrawalsThisMonth >= this.monthlyWithdrawalLimit) {
            throw WithdrawLimitExceededException()
        } else if (this.balance < amount) {
            throw NotEnoughMoneyException()
        }
        withdrawalsThisMonth++
        changeBalance(amount.negate())
        return TODO("Transaction will be implemented")
    }

    override fun changeBalance(amount: BigDecimal) {
        this.balance += amount
    }

    fun applyMonthlyInterest(INTERESTTYPE: InterestType, tempo: Period) {
        val totalDays= tempo.years * 365 + tempo.months*30 + tempo.days
        var totalInterest: BigDecimal = BigDecimal.ZERO
        if(INTERESTTYPE.equals(InterestType.SIMPLE)){
            val totalInterest = balance.multiply(interestRateDays).multiply(BigDecimal(totalDays))
        }else{
            val base = BigDecimal.ONE.add(this.interestRateDays)
            val compounded = base.pow(totalDays, MathContext.DECIMAL64)
            totalInterest = this.balance.multiply(compounded).subtract(this.balance)
        }
        changeBalance(totalInterest)
    }
}