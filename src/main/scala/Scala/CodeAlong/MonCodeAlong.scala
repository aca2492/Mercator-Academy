package Scala.CodeAlong

object MonCodeAlong extends App {
// VAL = BEST PRACTICE
  val melons = 5 * 50
  val apples = 2 * 10
  val fizzyDrink = 6 * (100*1.20)

  val total = melons + apples + fizzyDrink

// VAR = NOT BEST PRACTICE
//  var total: Double = 0
//  println(total)
//  total = total + melons
//  println(total)
//  total = total + apples
//  println(total)
//  total = total + fizzyDrink
//  println(total)

  println(melons)
  println(apples)
  println(fizzyDrink)
  println(total)

// TYPES
  val wholeNumber: Int = 35
  val littleNumber: Short = 46 //RARE TO USE
  val bigNumber: Long = 48468654648L //must put 'L' at end
  val littleDecimal: Float = 2.84468f //must put 'f' at the end
  val decimal: Double = 48454.484
  val text: String = "Howdily"
  val trueFalse: Boolean = true //lower case true or false
  val falseTrue: Boolean = false

  println(trueFalse == falseTrue)

//OPERATORS
  val a: Int = 10
  val b: Int = 5
  val c: Int = 3

  val add: Int = a + b
  val subtract: Int = b - c
  val divide: Double = c / a
  val multiply: Int = b * a
  val modulus: Int = a % c //find remainder odd or even 2 = even 1 = odd

  println(modulus)
  val even: Int = a % 2 //if left with 0 = even number
  println(even)

//RELATIONAL OPERATORS
  val equality: Boolean = a == a //Equality is true or false
  val inequality: Boolean = a != b //Inequality is true or false
  val lessThan: Boolean = c < a
  val lessThanEqual: Boolean = b <= a
  val greaterThan: Boolean = a > c
  val greaterThanEqual: Boolean = b >= c

//LOGICAL OPERATORS
  val and: Boolean = true && true //both true to be true
  val or:Boolean = true || false //one true to return true
  val not: Boolean = !false

//METHODS
  def makeACupOfTea(sugar: Int, milk: Boolean): String = {
    s"You have made a cup of tea with $sugar spoons of sugar. Your milk selection is: $milk"

  }

  println(makeACupOfTea(3, milk = true))

  val vat: Double = 1.2

  //Write method that calculates the final price of a product with VAT
  def finalPrice(product: Double): String = {
    val withVat: Double = product * vat

    s"Your product cost of $product plus vat of $vat makes a total of $withVat"
  }

  println(finalPrice(2.4))

//CLASSES
  class Dog (val name: String, val age: Int, val likesBananas: Boolean) {
    def speak:String = "woof" //declared in advance as always the same unless specific circumstances
  }
  //Use class to make object
  //Object of type dog
  val roscoe: Dog = new Dog("Roscoe", 7, true)
  //How to access
  println(roscoe.speak)
  println(roscoe.age)
  println(roscoe)

}
