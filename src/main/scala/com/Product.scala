package main.scala.com

abstract class Product {
  val name:String
  override def toString = "product" + name
}
abstract class Deposits extends Product{
  val intRate:Float
  val minBal:Int
}
abstract class Checking extends Deposits

abstract class Savings extends Deposits{
  val transMonth:Int
}

class CoreChecking(i:Float,m:Int) extends Checking{
  val intRate:Float = i
  val minBal: Int = m
   val name = "CoreChecking"
}

class StudentChecking(i:Float,m:Int) extends Checking{
  val intRate:Float = i
  val minBal: Int = m
  val name = "StudentChecking"

}

class RewardSavings(i:Float,m:Int,t:Int) extends Savings {
  val intRate:Float = i
  val minBal: Int = m
  val transMonth: Int = t
  val name = "RewardSavings"
}

abstract class Lending extends Product{
  val annual_fee:Double
  val apr:Double
  val rewardsPercent:Double
}
class CreditCard(a:Double,ap:Double,r:Double) extends Lending{
  val annual_fee: Double = a
  val apr: Double = ap
  val rewardsPercent: Double = r
  val name:String ="CreditCard"
}