package com.sw130.examples

object ForStuff {

  def main(args: Array[String]) {

    val myList = scala.collection.immutable.List("Uno", "Dos", "Tres")

    //-- ‘for’ (‘(’ Enumerators ‘)’ | ‘{’ Enumerators ‘}’) {nl} [‘yield’] Expr
    for (stringValue <- myList) {
      val filename = stringValue
      if (filename.endsWith("Uno"))
        println(filename)
    }
    println("----------")

    //-- another way to do this.
    for (
      file <- myList;
      fileName = file;
      if (fileName.endsWith("Dos"))
    ) println(file)

    println("----------")
    
    val aList = List(1, 2, 3)
    val bList = List(4, 5, 6)
    
    //-- note the toString call.
    for { 
      a <- aList; 
      b <- bList 
    }println("VARIABLES: "+a+" B: "+b+" TO-STRING: "+ a+b)
    
    println("----------")

    for { 
      a <- aList; 
      b <- bList 
    }println("VARIABLES: "+a+" B: "+b+" SUM: "+ (a+b))
    
    println("----------")
    
    for { a <- aList; b <- bList } println(a + b)
    
    println("----------")
    
    val result = for { a <- aList; b <- bList } yield a + b
    for(r <- result) println(r)
    println("----------")

    //-- yield stuff.
    val lara = Person("Lara", false)
    val bob = Person("Bob", true)
    val julie = Person("Julie", false, lara, bob)
    val persons = List(lara, bob, julie)
    
    
    for (p <- persons; if !p.isMale; c <- p.children) yield (p.name, c.name)

  }

  case class Person(name: String, isMale: Boolean, children: Person*)
  
}