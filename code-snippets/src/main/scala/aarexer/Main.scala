package aarexer

object Main extends App {
  //  val a = Option(List())
  //
  //  a match {
  //    case Some(List()) => println("LIST EMPTy")
  //    case Some(list) => println("LIST")
  //    case None => println("NONE")
  //  }
  //
  //  def printDoubles(arr: Array[Double]) {
  //    Option(arr) match {
  //      case Some(Array()) => println("empty array")
  //      case Some(a) => println(a mkString ", ")
  //      case None => println("array is null")
  //    }
  //  }
  //
  //  printDoubles(Array())

  compress(List(1, 2, 3, 1, 1, 1, 1, 1, 2, 2, 2, 2, 4))

  def compress[A](lst: List[A]) = {
    lst.foldRight(List[A]()) { (h, r) =>
      if (r.isEmpty || r.head != h) h :: r
      else r
    }
  }
}


