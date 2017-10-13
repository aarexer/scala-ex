package aarexer.examples

import scala.annotation.switch

object Demo extends App {
  val capital: String => String = {
    Map("France" -> "Paris", "Japan" -> "Tokyo", "Russia" -> "Moscow")
  }

  val popularity: String => Int = {
    case "Paris" => 5
    case "Tokyo" => 15
    case "Moscow" => 25
  }

  val pop: (String) => Int = popularity compose capital

  println(pop("France"))


  val lambda: String => Int = (s: String) => s.length


  println(lambda("Jello"))

  MapExamples.removeZeroNumbers(Seq(1, 2, 3, 4))
  MapExamples.removeZeroNumbers(Seq("asgasg", "asgasg"))

  /**
    * Switch annotation for matching
    *
    * @return
    */
  def switch(): String = {
    val i = 1
    (i: @switch) match {
      case 1 => "One"
      case 2 => "Two"
      case _ => "Other"
    }
  }

  //do you really need a plain switch?
  def switchAsMap = {
    val monthNumberToName = Map(
      1 -> "January",
      2 -> "February",
      3 -> "March",
      4 -> "April",
      5 -> "May",
      6 -> "June",
      7 -> "July",
      8 -> "August",
      9 -> "September",
      10 -> "October",
      11 -> "November",
      12 -> "December"
    )

    val monthName = monthNumberToName(4)
    println(monthName) // prints "April"
  }
}


object ZipExamples {
  def indexesWithZipWithIndexes(str: String) = str.zipWithIndex

  def indexesWithZipWithoutIndexes(string: String) = string zip (Stream from 0)
}


object MapExamples {
  def removeZeroNumbers[T <% Comparable[T]](seq: Seq[T]) = {

  }

  //  //flatmap
  //  def charsInStrings(list: List[String]): Map[String, Int] = {
  //
  //  }
}

object ReduceExample {
  //like reduce
  //  def mkString()
}

