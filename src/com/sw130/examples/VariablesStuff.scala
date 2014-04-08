package com.sw130.examples


/*
 * You should always prefer immutability to mutability. Keeping that in mind, always start with val when declaring
 * variables in Scala and change to var when it’s absolutely necessary.
 */
object VariablesStuff {

  def main(args: Array[String]) {

    //-- similar to final variables in Java
    val value = "I can not change this"
    
    var variable = "I do can change this"
    
    //-- var willKnowLater:String = _
    //-- when declaring variables (both val and var), you have to specify the value or _ (Scala placeholder);
    var willKnowLaterVar:String=null
    val willKnowLaterVal:String=null
    
    //-- does not call the function
    lazy val forLater = someTimeConsumingOperation()
    
    //-- call the function 
    val forLaterWithout = someTimeConsumingOperation()
    
    var a = 1
    println("VALUE A: "+a)
    
    lazy val b = a + 1
    println("VALUE B - the print forces the evaluation of b: "+b)
    //-- The lazy keyword is allowed only with val; you can’t declare lazy var variables in Scala.

  }
  
  def someTimeConsumingOperation() {
    
    Thread.sleep(500)
    println("I'm doing stuff that consumes time.")
    
  }

}