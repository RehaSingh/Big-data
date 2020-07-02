class Employee{
  var first = ""
  var last = ""
}

val rehaSingh = new Employee()
rehaSingh.first = "Reha"
rehaSingh.last = "Singh"

val vivekRawat = new Employee()
vivekRawat.first = "Vivek"
vivekRawat.last  = "Rawat"

rehaSingh = vivekRawat
rehaSingh == vivekRawat

