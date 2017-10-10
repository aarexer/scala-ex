package aarexer.examples

import scala.util.control.Breaks
import scala.util.control.Breaks.{break, breakable}

/**
  * How to use break approach in Scala.
  */
object BreaksExamples {

  /**
    * Example of using continue with breakable.
    * Prints all chars except 'c'.
    */
  def continueExample(): Unit = {
    for (x <- 'a' to 'e') {
      breakable {
        if (x == 'c') break else println(x)
      }
    }
  }

  /**
    * Example of break in scala.
    * Prints numbers until 49.
    */
  def exampleOfBreak(): Unit = {
    breakable {
      for (i <- 1 to 100) {
        if (i == 49) break else println(i)
      }
    }
  }

  /**
    * Example of using two breaks.
    */
  def exampleOfTwoBreaks(): Unit = {
    val inner = new Breaks
    val outer = new Breaks

    outer.breakable {
      for (i <- 1 to 5) {
        inner.breakable {
          for (j <- 'a' to 'e') {
            if (i == 1 && j == 'c') inner.break else println(s"i: $i, j: $j")
            if (i == 2 && j == 'b') outer.break
          }
        }
      }
    }
  }

  /**
    * Example of using break as val.
    */
  def exampleOfBreakWithBreaksVal(): Unit = {
    val Exit = new Breaks

    Exit.breakable {
      for (j <- 'a' to 'e') {
        if (j == 'c') Exit.break else println(s"j: $j")
      }
    }
  }

  /**
    * Example of using guard for imitation break.
    */
  def guardInsteadBreak(): Unit = {
    var flag = false
    for (x <- 'a' to 'e' if !flag) {
      if (x == 'c') flag = true
    }
  }
}
