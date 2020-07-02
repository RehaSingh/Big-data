{}/* Abstract classes / Inheritance / Composition
 */

abstract class Employee() {
  val first:String  /* mention type*/
  val last:String

  override def toString: String = first + " " + last
    }

abstract class Emplyee_details extends Employee{
  private val salary = "Big secret"
  val dept:String
  val dept_name:String
  val dsk_no:Int
}
/* first concrete class */
class HrDept(f:String,l:String) extends Employee{
  val first = f
  val last = l
  val dept = "Human Resources"
  val dept_code = "HR"

}
/* This too is considered first concrete class as it extends
Employee
 */
class RnD (f:String,l:String)extends Employee{
  val first = f
  val last = l
  val dept = "Research and Development"
  val dept_code = "R&D"
  }

val obj1 = new RnD("Reha","Singh")
val obj2 = new HrDept ("Vivek","Rawat")

/*Composition */
abstract class Company {
  val name:String
  val noOfEmp:Int
  val emplyees :Set[Employee]
}

class SophiaSchool(n:String,es:Set[Employee]) extends Company {
  val name = n
  val noOfEmp = es.size
  val emplyees = es
}

val Sophia = new SophiaSchool("Reha Singh",Set(obj1,obj2))



