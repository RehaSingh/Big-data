/** Creation of classes and objects
 */
class Employee {
  var first:String = ""
  var last:String = ""
}

var rehaSingh = new Employee
rehaSingh.first = "Reha"
rehaSingh.last = "Singh"
/* The address format is name of the class followed by @
followed by unsigned hash code of the object
 */
var vivekRawat = new Employee
vivekRawat.first = "Vivek"
vivekRawat.last = "Rawat"

var tianaRawat = new Employee()
tianaRawat.first = "Tiana"
tianaRawat.last = "Rawat"

rehaSingh = vivekRawat
rehaSingh
rehaSingh == vivekRawat
/* This is because of the usage of var. Two different object
references are pointing to the same memory address as we can see
which is not good
 */