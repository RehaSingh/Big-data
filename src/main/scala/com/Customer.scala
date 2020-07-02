package main.scala.com
import java.time.LocalDate

class Customer(first:String,last:String,email:String,dob:LocalDate) {
  private val f = first
  private val l = last
  private val e = email
  private val d = dob

  override def toString = first + "," +last

}
