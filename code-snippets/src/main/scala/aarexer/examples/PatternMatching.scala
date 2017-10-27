package aarexer.examples

object PatternMatching extends App {
  new PremiumUser("Hello") match {
    case PremiumUser(name) => println(s"hello $name")
    case _ => println("Unknown")
  }
}

trait User {
  def name: String
}

class FreeUser(val name: String) extends User

class PremiumUser(val name: String) extends User

object FreeUser {
  def unapply(user: FreeUser): Option[String] = Some(user.name)
}

object PremiumUser {
  def unapply(user: PremiumUser): Option[String] = Some(user.name)
}