package main.scala.com

class Account(c: Customer,p: Product,b:Int) {
  val customer = c
  val product = p
  private var balance = b

  def deposit(amt:Int) = {
    println(s"Depositing $amt to $customer account")
    balance += amt
  }
  def withdraw(amt:Int) = {
    println(s"Withdrawing $amt to $customer account")
    balance -= amt
  }
  override def toString = s"$customer of $product have remaining balance of $balance"
}
