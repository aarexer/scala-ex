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
}
