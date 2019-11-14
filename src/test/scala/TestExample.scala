package common


import org.scalatest.{WordSpec, Matchers}

class TestExample extends WordSpec with Matchers {
  "Example#mySort" should {
    "return sortedList" in {
      val l = List(9, 1, 3)
      val result = Example.mySort(l)
      result shouldBe(1, 3, 9)
    }
  }
}
