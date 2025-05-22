object Day8Task extends App {

  //MVP 1a
  val watermelonCount: Int = 5

  //MVP 1b+c
  println("MVP 1b+1c:")
  watermelonCount match{
    case watermelon if watermelon <=0 => println("No watermelons to carry")
    case watermelon if watermelon <=3 => println(s"John doesn't need a bag for $watermelonCount watermelons")
    case watermelon if watermelon <=5 => println(s"John needs a bag for $watermelonCount watermelons")
    case watermelon if watermelon >5 => println(s"John can't carry $watermelonCount watermelons")
    case _ => println("Please enter a valid amount of watermelons")
  }

  //MVP 1d
  val hasBag: Boolean = true

  //MVP 1e
  println("MVP 1e:")
  if(watermelonCount <= 0){
    println("You cannot buy less than 1 watermelon")
  }else if(watermelonCount <= 3 && (hasBag || !hasBag)) {
    println(s"You are able to buy $watermelonCount watermelons with or without a bag")
  }else if(watermelonCount <= 5 && hasBag){
    println(s"You are able to buy $watermelonCount watermelons with a bag")
  }else if(watermelonCount <= 5 && !hasBag){
    println(s"You are unable to buy $watermelonCount watermelons without a bag")
  }else if(watermelonCount > 5 && (hasBag || !hasBag)){
    println(s"You are unable to buy $watermelonCount watermelons with or without a bag")
  }

  //MVP 2
  println("MVP 2:")
  try{
    def toBePaid(miles: Int): String = {
      val calculatedAmount: Double = miles * 0.45
      s"For your journey of $miles miles you will be paid back £$calculatedAmount"
    }
    val milesInt = 205
    if (milesInt <0){
      println("Please enter a valid number")
    } else {
      println("Valid Int input: " + toBePaid(milesInt))
    }
    print("Invalid String input: ")
    val milesString = "twenty".toInt
    println(toBePaid(milesString))
  }catch{
    case error: NumberFormatException => println(s"$error was not a valid input for miles travelled")
  }

  //Extension 1
  // The order is as follows:
  //  ()[]
  //  ! ~
  //  * / %
  //  + -
  //    :
  //    < >
  //  = !
  //    &
  //  ^
  //  |
  //  &&
  //  ||
  //  (all letters, $, _)
  //This can be found on the scala documentation: https://docs.scala-lang.org/tour/operators.html
  //It can also be found on multiple online sources like 'Geeks for Geeks': https://www.geeksforgeeks.org/operators-precedence-in-scala/
  //Quick documentation can be found by using 'Command' and clicking, or pressing F1 whilst on an operator

  //Extension 2
  //'false && false' would take precedence, with 'true || result' following after
  //Expectation = true
  println("Extension 2:")
  println(true || false && false)


  //Extension 3
  //'true || false' would take precedence due to being within '()' followed by 'result && false'
  //Expectation = false
  println("Extension 3:")
  println((true || false) && false)

  //Extension 4
  //'9 + 10' then '1 < 4' then '9+10 result == 21' then '7 != 10' - as individual statements
  //'&&' would then come before '||'
  //'1 < 4 && 7 != 10' as a whole would be done before '9 + 10 == 21'
  //Expectation = true
  println("Extension 4:")
  println(1 < 4 && 7 != 10 || 9 + 10 == 21)



  //Research
  //It can be done by assigning the result to a variable within its creation.
  //Information on this can be found on scala documentation: https://docs.scala-lang.org/overviews/scala-book/if-then-else-construct.html

  //Research 1
  val num1: Int = 7
  val num2: Int = 4

  //Research 2
  println("Research 2:")
  val word1:String = if (num1 > num2){"yes"} else{"no"}

  println(s"Is the first value greater than the second: $word1")

}
