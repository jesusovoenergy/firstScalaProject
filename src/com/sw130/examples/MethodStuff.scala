package com.sw130.examples

/*
 * itÕs a good practice to specify the return type for the users of the library.
 * In Scala itÕs always possible to take out unnecessary syntax noise from the code.
 * Specifying return is optional in Scala. It will return the value of the last expression. -- see max function
 */
object MethodStuff {

  def main(args: Array[String]) {

    println("COMPLETE: " + welcome("JESUS"))

    println("NO RETURN: " + welcomeLess("JESUS"))

    println("NO EQUALS: " + welcomeLessX2())

    //-- with and without ()
    println("NAKED VERSION: " + welcomeLessNaked())
    println("NAKED VERSION: " + welcomeLessNaked)

    println("TOTALLY NAKED VERSION: " + welcomeLessTotallyNaked)

    //-- If the function has side effects, the common convention is to use Ò()Ó even though it isnÕt required.
    println("MAX 5 - 4: " + max(5, 4))
    println("MAX 5 - 7: " + max(5, 7))

    //-- parameter type. Java generics similar to Scala parameterized types.
    println("INTEGER LIST: " + toList(1))
    println("STRING LIST: " + toList("HOLA"))

    //-- FUNCTION LITERALS - PAG 33 ARTICULO
    val evenNumbers = scala.collection.immutable.List(2, 4, 6, 8, 10)
    println("FUNCTION LITERALS - closure: " + evenNumbers.foldLeft(0) { (a: Int, b: Int) => a + b })
    println("FUNCTION LITERALS NO PARAMETER - closure: " + evenNumbers.foldLeft(2) { (a, b) => a + b })
    println("FUNCTION LITERALS MAGIC - closure: " + evenNumbers.foldLeft(4) { _ + _ })
  }

  def welcome(name: String): String = { "exciting times ahead " + name }

  //-- no return type
  def welcomeLess(name: String) = { "exciting times ahead " + name }

  //-- no equals means retunrs nothing - void 
  def welcomeLessX2() { "exciting times ahead" }

  def welcomeLessNaked() = "exciting times ahead"

  def welcomeLessTotallyNaked = "exciting times ahead"

  def max(a: Int, b: Int) = if (a > b) a else b

  def toList[A](value: A) = List(value)
}