class Employee{
  var first = ""
  var last = ""
  override def toString:String = first+" "+last
  /* toString is a method - redifning what we see when printing the
  * object */
}

val rehaSingh = new Employee
rehaSingh.first = "Reha"
rehaSingh.last = "Singh"

rehaSingh

rehaSingh.first = "Vivek"
rehaSingh.last = "Singh"

rehaSingh

/* The member fields of the class Employee are var hence can be changed
It is the objects responsibility to take care of the state
not the object reference
 */