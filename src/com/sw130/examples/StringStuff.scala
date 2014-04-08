package com.sw130.examples

object StringStuff {

  def main(args: Array[String]) {

    //-- scpae characters
    val bookName = "Scala in \"Action\""

    //-- multi-line
    val multiLine = """This is a
	 multi line
	 string"""

    //-- multi-line no margin
    val multiLineNoBlank = """This is a
		| multi line
		| string""".stripMargin

    println(bookName)
    println(multiLine)
    println(multiLineNoBlank)

    //-- string interpolation
    val name = "Jesus"
    println(s"My name is $name") //-- if we do not include the s the output is: My name is $name
    
    //-- Similarly prepending f to any string literal allows the creation of simple formatted strings, similar to printf
    //-- in other languages:
    val height = 1.9d
    val otherName = "Jeshua"
    println(f"$otherName%s is $height%2.2f meters tall")

  }

}