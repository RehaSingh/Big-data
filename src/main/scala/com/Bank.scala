package main.scala.com

class Bank (n:String,c:String,co:String,e:String,p:Set[Product],
            cu:Set[Customer],ac:Set[Account])
  { val name: String = n
    val city: String =c
    val country: String = co
    val email = e
    val products: Set[Product] = p
    val customers: Set[Customer] = cu
    val accounts: Set[Account] = ac
}
