package ScalaAfternoonTasks

object Day7Task extends App {

  //MVP 1
  val taxpayerFore: Seq[String] = Seq("Alan", "Simon", "Ethan", "Josh", "Alan", "Tobi", "Ethan", "Paul", "Joe", "Josh", "Josh")

  //MVP 2
  println("MVP 2:")
  println(s"The following taxpayers $taxpayerFore have all been submitted")

  //MVP 3
  def taxReturnCount(taxpayerName: String):Int ={
    val nameCount:Int = taxpayerFore.count(_ == taxpayerName)
    nameCount
  }

  //MVP 4
  println("MVP 4:")
  println(s"The customer Alan has submitted their tax return ${taxReturnCount("Alan")} times")
  println(s"The customer Josh has submitted their tax return ${taxReturnCount("Josh")} times")

  //MVP 5
  val taxPayerSet: Set[String] = taxpayerFore.toSet

  //MVP 6
  println("MVP 6:")
  println(s"The unique tax payers are: $taxPayerSet")

  //MVP 7
  def taxReturnCountAny(taxpayerName: String, anyCollection: Iterable[String]):Int ={
    val nameCount:Int = anyCollection.count(_ == taxpayerName)
    nameCount
  }

  //MVP 8
  println("MVP 8:")
  println("Tax Return Count for Josh in Seq: " + taxReturnCountAny("Josh", taxpayerFore))
  println("Tax Return Count for Josh in Set: " + taxReturnCountAny("Josh", taxPayerSet))

  //MVP 9a
  val failedAttempts: Map[String, Int] = Map(
    "Alan" -> 2,
    "Simon" -> 7,
    "Ethan" -> 3,
    "Josh" -> 8,
    "Tobi" -> 1,
    "Paul" -> 3,
    "Joe" -> 5
  )

  //MVP 9b
  println("MVP 9b: ")
  println("Full Map: " + failedAttempts)
  println(s"The user ${failedAttempts.head._1} has ${failedAttempts.head._2} failed login attempts")

  val failedAttemptsSeq = failedAttempts.toSeq
  val user0: Tuple2[String, Int] = failedAttemptsSeq.head
  println(s"Alt Method: User ${user0._1} failed ${user0._2} times")

  val userHeadKey: String = failedAttempts.keys.toSeq.head
  val userHeadVal: Int = failedAttempts.values.toSeq.head
  println(s"Alt Alt: User $userHeadKey failed $userHeadVal times")

  //MVP 9c
  val newFailedAttempts: Map[String, Int] = failedAttempts + ("Mike" -> 3)
//  val newFailedAttemptsSeq = failedAttemptsSeq ++ ("Mike" -> 3)

  //MVP 9d
  println("MVP 9d:")
  val key = newFailedAttempts.keys.toSeq(1)



  //Extension 1a
  println("Extension 1a")
  val dayOne: Set[String] = taxPayerSet
  val dayTwo: Set[String] = Set("Joe", "Charlie", "Luke", "Amy", "Phil", "Tobi")
  val bothDaysSet = dayOne.filter(dayTwo)
  println("The following users submitted on both days: " + bothDaysSet)
  val bothDaySetAlt: Set[String] = dayOne intersect dayTwo
  println("The following users submitted on both days: " + bothDaySetAlt.mkString(", "))

  //Extension 1b
  println("Extension 1b")
  val dayOneOnly = dayOne.filterNot(dayTwo)
  println("The following users submitted on day 1 only: " + dayOneOnly)
  val dayOneOnlyAlt: Set[String] = dayOne.diff(dayTwo)
  println("The following users submitted on day 1 only: " + dayOneOnlyAlt.mkString(", "))

  //Extension 1c
  println("Extension 1c")
  val allSubmitters = dayOne ++ dayTwo
  println("All unique submitters: " + allSubmitters)
  //val allSubmittersAlt



}
