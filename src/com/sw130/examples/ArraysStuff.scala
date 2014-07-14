package com.sw130.examples

object ArraysStuff {

  def main(args: Array[String]) {

    	//-- array: Array[String] = Array(null, null, null)
    	val array = new Array[String](3)
    	
    	array(0) = "This"
    	array(1) = "is"
	array(2) = "mutable"
	
	//-- relp: res37: Array[String] = Array(This, is, mutable)
	println(array.toString())
    
	//-- other way to print
	array.foreach(println)
	
	//-- myList: List[java.lang.String] = List(This, is, immutable)
	//-- scala.collection.immutable.List,
	val myList = scala.collection.immutable.List("This", "is", "immutable")
	
	//-- getClass()  //> res1: Class[?0] = class scala.collection.immutable.$colon$colon
	println("CLASS NAME: "+array.getClass)
	
	//-- scala.collection.immutable.List is an abstract class
	//-- two implementations: scala.Nil (represents an empty) and scala.:: (represents any nonempty list)
	//-- :: is a valid identifier, and you could use it to name a class. 
	
	val oldList = List(1, 2)
	oldList.foreach(println)
	println("----------")
	
	//-- left insert
	val newList = 3 :: oldList
	newList.foreach(println)
	println("----------")
	
	//-- right insert
	val newList2 = oldList :+ 3
	newList2.foreach(println)
	println("----------")
	
	//-- new instance of List every time you add an element.
	val myList3 = "This" :: "is" :: "immutable" :: Nil
	
	//-- delete
	val afterDelete = newList.filterNot(_ == 3)
	afterDelete.foreach(println)
	println("----------")
	
	
	
  }

}
