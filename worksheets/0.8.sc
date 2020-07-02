object Employee{
  private val DepartmentNameByValue:Map[String,String] = Map(
    "HR"->"Human Resources",
    "R&D"->"Research and Development")

    def apply(first:String,last:String,stocks:Int):Employee=
      new Employee(first,last,stocks)

    def getDepartmentName(code:String):String=
      DepartmentNameByValue.getOrElse(code,"code does not exist")
}
class Employee(f:String,l:String,s:Int){
   private val first =f
  private val last = l
  private var stocks =s

  def getFirst = first
  def getLast = l
  def getstocks=stocks

  def awardMoreStocks(noOfStocks:Int) = stocks += noOfStocks

  override def toString = first+" "+last+ " "+stocks

}

val obj_singleton = Employee("Reha","Singh",10)
obj_singleton.getFirst
obj_singleton.getLast
obj_singleton.awardMoreStocks(10)
Employee.getDepartmentName("R&D") /* Singleton object cannot be
instantiated */
