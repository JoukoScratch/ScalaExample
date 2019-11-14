package common

object Example {
  def main(args: Array[String]): Unit = {
    println("Hello")
  }

  def mySort(l: List[Int]): List[Int] = {
    l.sortBy( x => x )
  }
}
