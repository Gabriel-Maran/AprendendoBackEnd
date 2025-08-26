package coreBancarioSimples.exception

import java.lang.RuntimeException

sealed class BankException(message: String): RuntimeException()

class NotEnoughMoneyException(message: String = "Saldo Insuficiente") : BankException(message)
class AccountNotFoundException(message: String = "Conta não encontrada"): BankException(message)
class WithdrawLimitExceededException(message: String = "Limite de saque atinigido"): BankException(message)
