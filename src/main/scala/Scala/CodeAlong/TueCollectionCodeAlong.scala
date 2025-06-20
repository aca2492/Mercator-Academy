package Scala.CodeAlong

object TueCollectionCodeAlong extends App{

  val firstSet: Set[Int] = Set(1,2,3,4,5,5) //Not ordered, does not allow repeat values
  println("First Set: " + firstSet)

  val firstSequence: Seq[Int] = Seq(1,2,3,4,5,5) //In order (sequential), allows repeat values
  println("First Sequence: " + firstSequence)

  //Maps take 2 parameters (Key -> Value). We call these key value pairs, and keys must be unique, no two keys can be
  // the same, however can have multiple values the same.
  val firstMap: Map[String, Int] = Map(
    "one" -> 1,
    "two" -> 2,
    "three" -> 3,
    "four" -> 4,
    "five" -> 5,
    "five" -> 5 //Will remove this when compiled without an error
  )
  println("First Map: " + firstMap)

  //ACCESSING DATA
  //SEQ
  val getSeqHead: Int = firstSequence.head //index position 0 (first element)
  println("Sequence Head: " + getSeqHead)
  val getSeqTail: Seq[Int] = firstSequence.tail //Everything BUT the head
  println("Sequence Tail: " + getSeqTail)
  val getSeqIndex: Int = firstSequence(3) //Only works with ordered collections
  println("Sequence Index: " + getSeqIndex)

  //SET
  val getSetIndex = firstSet(3) //Checks if the value is contained in the set. Can also use .contains
  println("Exist within set: " + getSetIndex)
  //Often filter information in sets
  val filterSet: Set[Int] = firstSet.filter(_<3)
  println("Filtered Set: " + filterSet)
  val filterNotSet: Set[Int] = firstSet.filterNot(_<3)
  println("Filter Not Set: " + filterNotSet)
  val evenSet: Set[Int] = firstSet.filter(_%2 == 0)
  println("Even Set: " + evenSet)

  //MAP
  val getMapValue: Int = firstMap("two") //Only works this way around. Enter key for value.
  println("Get Map Value: " + getMapValue)
  val getMapKey: String = firstMap.find(_._2 == 4).get._1 //Finds value equal to 1 and get associated key
  println("Get Map Key: " + getMapKey)

  //TASK
  val nameSeq: Seq[String] = Seq("Adam", "Ajan", "Andrew", "April")
  println("Sequence of Names" + nameSeq)
  val colourMap: Map[Int, String] = Map(
    1 -> "red",
    2 -> "yellow",
    3 -> "blue",
    4 -> "green"
  )
  val filterColourBlue: String = colourMap(3)
  println("Filter Blue: " + filterColourBlue)

  val filterInts: Set[Int] = firstSet.filter(_>2)
  println("Filtered above 2: " + filterInts)

  //MAPPING
  //map (method = lowercase 'm') - Used to iterate through a collection
  def tripledSet(inputSet: Set[Int]): Set[Int] = inputSet.map{
    _ * 3
  //  number => number *3 - Same as above
  }
  println("Tripled Set: " + tripledSet(firstSet))

  def tripledSeq(inputSeq: Seq[Int]): Seq[Int] = inputSeq.map{
    _ * 3
    //  number => number *3 - Same as above
  }
  println("Tripled Seq: " + tripledSeq(firstSequence))

  def tripledMap(inputMap: Map[String, Int]): Map[String, Int] = inputMap.map{
    case (key, value) => (key, value * 3) //Can also change key
    }
  println("Tripled Map: " + tripledMap(firstMap))
  // .exists - all that could be (get your collection back for all that match
  // .contains - boolean result for if it exists

  //TASKS Pt2
  def addOne(inputSeq: Seq[Int]): Seq[Int] = inputSeq.map{
    _ + 1
  }
  println("Sequence before: " + firstSequence)
  println("Sequence +1 to all: " + addOne(firstSequence))

  def containsR(inputSeq: Seq[String]): Seq[Boolean] = inputSeq.map{
    _.contains('r')
  }
  println("Contains R: " + containsR(nameSeq))

//  def containsR2(inputSeq: Seq[String]): Seq[Boolean] = nameSeq.exists(word => word.contains('r'))
//  println("Contains R2: " + containsR2(nameSeq))

//  def removeEven(inputSet: Set[Int]): Set[Int] = inputSet.map{
//    _%2 != 0
//  }
//  println(removeEven(firstSet))


  //FLATMAPS
  val flatMapNames: Seq[Char] = nameSeq.flatMap(_.toUpperCase)
  println("FlatMap: " + flatMapNames)

  val newSeq: Seq[Int] = Seq(6,7,8)
  //Append - add to the end of collection
  val appendedListOne = firstSequence :+ newSeq
  println("Append with :+ :" + appendedListOne)
  val appendedListTwo = firstSequence ++ newSeq
  println("Append with ++ : " + appendedListTwo)

  //Prepend - add to the beginning of the collection
  val prependListOne = newSeq +: firstSequence
  println("Prepend with +: :" + prependListOne)
  val prependListTwo = newSeq ++ firstSequence
  println("Prepend with ++ :" + prependListTwo)


}
