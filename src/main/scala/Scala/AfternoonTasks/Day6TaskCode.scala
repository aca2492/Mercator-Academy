package Scala.AfternoonTasks

object Day6TaskCode extends App {

  //MVP 1

  //MVP 1a - True
  println("MVP 1a:")
  val mvp1anum1: Int = 3+(4*57)
  val mvp1anum2: Int = 300
  println(mvp1anum1 < mvp1anum2)

  //MVP 1b - True
  println("MVP 1b:")
  val mvp1bnum1: Int = 144
  val mvp1bnum2: Int = 12
  println(mvp1bnum1/mvp1bnum2 >= mvp1bnum2)

  //MVP 1c - False
  println("MVP 1c:")
  val mvpCat: String = "Cat"
  val mvpDog: String = "Dog"
  println(mvpCat.length < mvpDog.length)

  //MVP 1d - True
  println("MVP 1d:")
  val mvpRabbit: String = "Rabbit"
  val mvpHamster: String = "Hamster"
  println(mvpRabbit.length < mvpHamster.length)

  //MVP 1e - True
  println("MVP 1e:")
  val mvp1enum: Int = 17
  val mvp1eodd: Int = 1
  println(mvp1enum % 2 == mvp1eodd)

  //MVP 1f - True
  println("MVP 1f:")
  val mvp1fnum1: Double = 75/9
  val mvp1fnum2: Int = 30
  val mvp1fnum3: Double = 89/6
  val mvp1fnum4: Int = 20

  println(mvp1fnum1 < mvp1fnum2 && mvp1fnum3 < mvp1fnum4)

  //MVP 2

  //The 'String' "i love scala already" is a value/variable that if given a name will be able to be called upon,
  // whereas "println("i love scala already")" will be an individual print statement that would need repeating to
  // print the statement again, and would not be able to call upon it.

  //MVP 3
  println("MVP 3:")
  def squareRoot(mvp3num: Int): Int = {

    val square: Int = mvp3num * mvp3num

    square

  }

  println(squareRoot(5))
  println(squareRoot(9))

  //MVP 4
  println("MVP 4:")
  def isNumOdd(mvp4num: Int): Boolean ={

    val odd: Int = 1
    mvp4num % 2 == odd

  }

  println(isNumOdd(24))
  println(isNumOdd(81))

  //MVP 5
  println("MVP 5:")
  class Book(val title: String, val pages: Int, val genre: String, val author: String, val available: Boolean) {
    def library: String = "Academy"
  }

  val qascala: Book = new Book("Scala for QA's", 186, "Education", "April", true)

  println(qascala.genre)
  println(qascala.pages)
  println(s"The book named ${qascala.title} by ${qascala.author} at ${qascala.library} is available: ${qascala.available}")

  //Can make a class for its own individual for class safety/sensitivity such as class Title(title:string) and use this in place for class parameter.

  //Extension 1
  println("Extension 1:")
  val ex1Lower: String = "cheese"
  val ex1Upper: String = ex1Lower.toUpperCase

  println(s"$ex1Lower becomes $ex1Upper")

  //Extension 2
  println("Extension 2:")
  val ex2Lower: String = "house"
  val ex2Upper: String = ex2Lower.capitalize

  println(s"$ex2Lower becomes $ex2Upper")

  //Extension 3
  println("Extension 3:")
  val ex3Lower: String = "string"
  val ex3Upper: String = "STRING"

  println(ex3Lower == ex3Upper)
  //Scala uses the Unicode character set like many other languages, as such the ASCII values for uppercase and lowercase
  //letters in the alphabet are different.

  //Extension 4
  //This cannot be simply done, it would be better to create a new value with the Int type, as there is not a built in
  // function for this. However, this could be done using extra values and an if statement.


  //Extension 5
  //This cannot be simply done, it would be better to create a new value with the String type, as there is not a built in
  // function for this. However, this could also be done using extra values and if statement.

  //Extension 6
  println("Extension 6:")
  val ex6Num: Int = 1;
  val ex6String: String = ex6Num.toString

  println(ex6String)
  //The result as expected is the number is treated as a string and still displays the same when printed, however would not be
  // able to use for calculations.
  println(23 + ex6String)
  //As shown from the above print, when displayed it adds it to the end of the number as a simple string.

  //Research 1
  //val new: String = "Mouse"
  //The val new is not a valid name for a value/variable as it is a keyword already in use within the language, and would cause
  // issues in calling the needed value/variable

  //Research 2
  //We would need to give it a clear valid name for the variable in order for it to compile.
  //We are unable to use any keywords or reserved words, such as abstract, case, class, def.
  //Can use backticks to work around the issue of cannot avoid it.

  //Research 3
  //A case class has all constructor parameters are public by default as opposed to class which has them private by default.
  //Case classes have an apply function which is auto generated by the compiler, allowing to skip the 'new' keyword.
  //Case classes have a companion object generate by the compiler, which allows for pattern matching.
  //Case classes are compared by their structure instead of their references, unlike usual classes.
  //Case classes are limited in their ability to inherit from another case class.
  //A case class can serve well as a simple data container, and modeling immutable data, as well as for pattern matching.
  //Classes should be used if the class requires extra logic


}
