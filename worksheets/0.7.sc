/* Singleton Object in the scala code base
we can even define utils in singleton object eg. predef
 */

object MyApplication{
  def main(args:Array[String]) = {
    println("It is a wonderful day")
    args.foreach(println)
  }
}
MyApplication.main(Array("Hello","World"))
