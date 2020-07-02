/* Class parameters - provide the values to the object when you instantiate them */

class Employee(val first:String,val last:String){
  override def toString = first + " " + last
}

val rehaSingh = new Employee("Reha","Singh")
rehaSingh

/* try to access the field of this instance */
rehaSingh.first
/* Visibility of the constructor fields -
Fields not member fields of the class but the variables
for which we pass the values to create an instance
In this case access modifier is default - means no visibility
and no modification.
Four types - var,val,default,private(var/val)
 */

/* Imp Note -  when we apply access modifier in the class
 declaration as the class parameters
it becomes the part of the public member field of the class
 */

class color (val value:String) /*public val member*/
val c = new color("red")
c.value

class color2 (var value:String)
val c2 = new color2("red")
c2.value
c2.value = "Blue"
c2.value
/*  in above two cases the class parameters are public
hence can be mutated anytime ( in case of public var member)
 */