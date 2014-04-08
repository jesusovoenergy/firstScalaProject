package com.sw130.manning

object VariablesTesting {
  var a = 1                                       //> a  : Int = 1
  lazy val b = a + 1                              //> b: => Int
  a = 5
  b                                               //> res0: Int = 6
	
	//-- The :: (called cons) is a method defined in List
	val first :: rest = List(1, 2, 3, 4, 5)   //> first  : Int = 1
                                                  //| rest  : List[Int] = List(2, 3, 4, 5)


	val myList = scala.collection.immutable.List("This", "is", "immutable")
                                                  //> myList  : List[String] = List(This, is, immutable)

	myList.getClass()                         //> res1: Class[?0] = class scala.collection.immutable.$colon$colon

}