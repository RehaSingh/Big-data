/* To maintain immutability, change var to val  - threadsafe:if two threads try to access the same
variable , it must not changed the internal state , chances of creating corruptive object
under thread race condition
 */

object Employee{
  def apply(first:String,last:String,stocks:Int):Employee ={
    new Employee(first,last,stocks)
  }
}

class Employee(f:String,l:String,s:Int) {
  private val first = f
  private val last = l
  private val stocks = s

  def awardMoreStocks(noOfStocks: Int): Employee = {
    Employee(first, last, stocks + noOfStocks)
  }
  /* These are functional objects where we have objects
  containing the state but have functions that are pure
  and return the new object without modifying the
  internal state of teh existing object
   */

  override def toString: String = first + " " + last + " " + stocks

}

val rehaSingh = Employee("Reha","Singh",10)
rehaSingh.awardMoreStocks(15)
