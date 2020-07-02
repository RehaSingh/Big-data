/* In the context of object oriented principals the data must be encapsulated and should only be modified with the use of
the methods which are class members.
We achieve this by passing the values through class parameters and storing these values of class parameters in fields
 */

class Employee(f:String, l:String, s:Int) {

  private val first:String = f
  private val last:String = l
  private var stocks:Int = s
/* we are defining below functions to display values as we cannot directly access the variables using the object instance

 */
  def getFirst:String = first
  def getLast:String = last
  def getStocks:Int = stocks

  def awardMoreStocks(numberOfStocks:Int) = {
    stocks+= numberOfStocks
  }
  override def toString = first + " " + last + " " + stocks
}

val RehaSingh = new Employee("Reha","Singh",10)
RehaSingh.getFirst
RehaSingh.getLast
RehaSingh.getStocks

RehaSingh.awardMoreStocks(15)
RehaSingh.getStocks






