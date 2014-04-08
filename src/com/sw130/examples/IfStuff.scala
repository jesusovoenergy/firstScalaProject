package com.sw130.examples

object IfStuff {
  
  def main(args: Array[String]) {
    
    val compare = false
    
    //-- Scala doesn’t support the ? operator as Java does
    val someValue = if(compare) 1 else 2
        
  }

}