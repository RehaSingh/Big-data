import java.time.LocalDate

import main.scala.com._
object BankOfScala {
  def main (args:Array[String]) = {
    println("Instantiating Bank")
    val coreChecking: CoreChecking = new CoreChecking(25,1000)
    val studentChecking = new StudentChecking(10,0)
    val rewardSavings = new RewardSavings(10,1000,1)
    val creditCard = new CreditCard(99,14.23,20.00)

    val products = Set(coreChecking,studentChecking,rewardSavings,creditCard)
    val bobMartin = new Customer("Bob","Martin", "bob@gmail.com",LocalDate.of(1988,10,15))
    val accountCoreChecking = new Account(bobMartin,coreChecking,22)
    val accountStudentChecking = new Account(bobMartin,studentChecking,1000)
    val accountRewardSavings = new Account(bobMartin,rewardSavings,20000)
    val accountCreditCard = new Account(bobMartin,creditCard,4500)
    val accounts = Set(accountCoreChecking,accountStudentChecking,accountRewardSavings,accountCreditCard )

    val bank = new Bank("Bank of Scala","Bangalore","India","thakurreha15@gmail.com",products,
      Set(bobMartin),accounts)
    println(accountCoreChecking)
    accountCoreChecking.deposit(100)
    accountCoreChecking.withdraw(100)


  }

}
