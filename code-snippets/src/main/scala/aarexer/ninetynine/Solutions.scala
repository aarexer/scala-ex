package aarexer.ninetynine

import java.util.NoSuchElementException

object Solutions {

  /**
    * Problem 1
    * Find the last element of a list.
    * Example:
    * scala> last(List(1, 1, 2, 3, 5, 8))
    * res0: Int = 8
    */
  def last[A](ls: List[A]): A = ls.last

  def last_2[A](ls: List[A]): A = {
    ls match {
      case e :: Nil => e
      case _ :: tail => last_2(tail)
      case _ => throw new NoSuchElementException
    }
  }

  /**
    * Problem 2
    * Find the last but one element of a list.
    * Example:
    * scala> penultimate(List(1, 1, 2, 3, 5, 8))
    * res0: Int = 5
    */
  def penultimate[A](ls: List[A]): A = if (ls.isEmpty) throw new NoSuchElementException else ls.init.last

  def penultimate_2[A](ls: List[A]): A = {
    ls match {
      case e :: _ :: Nil => e
      case _ :: tail => penultimate_2(tail)
      case _ => throw new NoSuchElementException
    }
  }

  /**
    * Problem 3
    * Find the Kth element of a list.
    * By convention, the first element in the list is element 0.
    * Example:
    * scala> nth(2, List(1, 1, 2, 3, 5, 8))
    * res0: Int = 2
    */
  def nth[A](n: Int, lst: List[A]): A = if (n >= 0 && lst.nonEmpty) lst(n) else throw new NoSuchElementException

  def nth_2[A](n: Int, lst: List[A]): A = {
    (n, lst) match {
      case (0, h :: _) => h
      case (n, _ :: tail) => nth_2(n - 1, tail)
      case (_, Nil) => throw new NoSuchElementException
    }
  }

  /**
    * Problem 4
    * Find the number of elements of a list.
    * Example:
    * scala> length(List(1, 1, 2, 3, 5, 8))
    * res0: Int = 6
    */
  def length[A](list: List[A]): Int = list.length

  def length_2[A](list: List[A]): Int = list match {
    case Nil => 0
    case _ :: tail => 1 + length_2(tail)
  }

  def length_3[A](list: List[A]): Int = list.foldLeft(0) { (c, _) => c + 1 }

  /**
    * Problem 5
    * Reverse a list.
    * Example:
    * scala> reverse(List(1, 1, 2, 3, 5, 8))
    * res0: List[Int] = List(8, 5, 3, 2, 1, 1)
    */
  def reverse[A](list: List[A]): List[A] = list.reverse

  def reverse_2[A](list: List[A]): List[A] = list match {
    case Nil => Nil
    case e :: tail => reverse_2(tail) ::: List(e)
  }

  def reverse_3[A](ls: List[A]): List[A] = ls.foldLeft(List[A]()) { (r, h) => h :: r }

  /**
    * Problem 6
    * Find out whether a list is a palindrome.
    * Example:
    * scala> isPalindrome(List(1, 2, 3, 2, 1))
    * res0: Boolean = true
    */
  def isPalindrome[A](list: List[A]): Boolean = list == list.reverse

  /**
    * Problem 7
    * Flatten a nested list structure.
    * Example:
    * scala> flatten(List(List(1, 1), 2, List(3, List(5, 8))))
    * res0: List[Any] = List(1, 1, 2, 3, 5, 8)
    */
  def flatten(list: List[Any]): List[Any] = list flatMap {
    case ms: List[_] => flatten(ms)
    case e => List(e)
  }

  //todo
  /**
    * Eliminate consecutive duplicates of list elements.
    * If a list contains repeated elements they should be replaced with a single copy of the element. The order of the elements should not be changed.
    * Example:
    * *
    * scala> compress(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e))
    * res0: List[Symbol] = List('a, 'b, 'c, 'a, 'd, 'e)
    */
  def compress[A](lst: List[A]): List[A] = {
    lst.foldRight(List[A]()) { (h, r) =>
      if (r.isEmpty || r.head != h) h :: r
      else r
    }
  }

}
