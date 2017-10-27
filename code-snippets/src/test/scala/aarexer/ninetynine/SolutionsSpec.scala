package aarexer.ninetynine

import org.scalatest.{FlatSpec, Matchers}

class SolutionsSpec extends FlatSpec with Matchers {
  "last method " should "return 1 from list [1]" in {
    Solutions.last(List(1)) shouldEqual 1
  }

  it should "return 3 in list [1,2,3]" in {
    Solutions.last(List(1, 2, 3)) shouldEqual 3
  }

  it should "return 'a' in list ['b','a']" in {
    Solutions.last[Char](List('b', 'a')) shouldBe 'a'
  }

  it should "throw NoSuchElementException when list is empty" in {
    an[NoSuchElementException] should be thrownBy Solutions.last(List())
  }

  "last_2 method " should "return 1 from list [1]" in {
    Solutions.last_2(List(1)) shouldEqual 1
  }

  it should "return 3 in list [1,2,3]" in {
    Solutions.last_2(List(1, 2, 3)) shouldEqual 3
  }

  it should "return 'a' in list ['b','a']" in {
    Solutions.last_2[Char](List('b', 'a')) shouldBe 'a'
  }

  it should "throw NoSuchElementException when list is empty" in {
    an[NoSuchElementException] should be thrownBy Solutions.last_2(List())
  }

  "penultimate method" should "return 2 from list [1,2,3]" in {
    Solutions.penultimate(List(1, 2, 3)) shouldEqual 2
  }

  it should "return 1 from list [1,2]" in {
    Solutions.penultimate(List(1, 2)) shouldEqual 1
  }

  it should "throw NoSuchElementException when list has one element like [1]" in {
    an[NoSuchElementException] should be thrownBy Solutions.penultimate(List(1))
  }

  it should "throw NoSuchElementException when list is empty" in {
    an[NoSuchElementException] should be thrownBy Solutions.penultimate(List())
  }

  "penultimate_2 method" should "return 2 from list [1,2,3]" in {
    Solutions.penultimate_2(List(1, 2, 3)) shouldEqual 2
  }

  it should "return 1 from list [1,2]" in {
    Solutions.penultimate_2(List(1, 2)) shouldEqual 1
  }

  it should "throw NoSuchElementException when list has one element like [1]" in {
    an[NoSuchElementException] should be thrownBy Solutions.penultimate_2(List(1))
  }

  it should "throw NoSuchElementException when list is empty" in {
    an[NoSuchElementException] should be thrownBy Solutions.penultimate_2(List())
  }

  "nth method" should "return 2 from list [1,2,3]" in {
    Solutions.nth(1, List(1, 2, 3)) shouldEqual 2
  }

  it should "return 1 from list [1,2]" in {
    Solutions.nth(0, List(1, 2)) shouldEqual 1
  }

  it should "throw NoSuchElementException when list is empty and we try to get element" in {
    an[NoSuchElementException] should be thrownBy Solutions.nth(1, List())
  }

  it should "throw NoSuchElementException when index is negative" in {
    an[NoSuchElementException] should be thrownBy Solutions.nth(-1, List())
  }

  "nth_2 method" should "return 2 from list [1,2,3]" in {
    Solutions.nth_2(1, List(1, 2, 3)) shouldEqual 2
  }

  it should "return 1 from list [1,2]" in {
    Solutions.nth_2(0, List(1, 2)) shouldEqual 1
  }

  it should "throw NoSuchElementException when list is empty and we try to get element" in {
    an[NoSuchElementException] should be thrownBy Solutions.nth_2(1, List())
  }

  it should "throw NoSuchElementException when index is negative" in {
    an[NoSuchElementException] should be thrownBy Solutions.nth_2(-1, List())
  }
}
