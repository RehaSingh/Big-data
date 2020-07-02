/* Singleton Objects
Sometimes we want to create methods which do not act on fields*/

class Employee(first:String,last:String,stocks:Int) {
  private val departmentCodeByName:Map[String,String] =Map(
    "HR"->"Human Resources",
    "ACT"->"Accounts",
    "R&D"->"Research and Development"
  )

  private val f = first
  private val l = last
  private var s = stocks

  def getFirst = f
  def getLast = l
  def getStocks = s

  def awardMoreStocks(noOfStocks:Int)= s += noOfStocks

  def getDepartmentName(code:String) =
     departmentCodeByName.getOrElse(code,"Code does not exist")

  override def toString: String = first + " " + last + " " + stocks
}

val RehaSingh = new Employee("Reha","Singh",10)
RehaSingh.getDepartmentName("me")

/* But why do we need to create an instance to access the department name
 */
/* Singleton objects:
1. They cannot be instantiated, cannot use new keyword to create an instance
from singleton object.
2. There is only one object with that classname in the entire JVM.
3. They are initialised the first time one tries to access it.
4. There are two primary use case of singleton objects
   1. Companion object
   2. Standalone singleton objects
 Companion objects
 1. Are the singleton objects that resides in the same file as the class of the
  same name.
 2. The companion object and the companion class can access private members
 of each other
 3. The companion object has a special apply method that creates a new instance
 for the companion class without using the new keyword.
 Singleton object - the way to create a singleton object is to create a class
 and replace the class keyword with object
  */

