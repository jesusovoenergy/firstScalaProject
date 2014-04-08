package com.sw130.examples

object ExceptionStuff {

  def main(args: Array[String]) {

    println("HOLA")

    val var1 = "SCALA_HOME"
    if (var1 == null) break else println("we do not throw the exception")

    val var2 = System.getenv("WHAT_EVER")
    if (var2 == null)
      break
    else
      println("found scala home lets do the real work")

  }

  val breakException = new RuntimeException("break exception")

  def break = throw breakException

}