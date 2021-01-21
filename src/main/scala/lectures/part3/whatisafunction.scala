package lectures.part3

trait MyFunction[A, B] {

  def apply(element: A): B
}
object whatisafunction {
  //use and work with functions as first class elements
  val doubler = new MyFunction[Int, Int] {
    override def apply(element: Int): Int = element * 2
  }
  println(doubler(2))

  //function type = function[a,b]
  val StringtoIntconv = new Function1[String, Int] {
    override def apply(string: String): Int = string.toInt
  }
  println(StringtoIntconv("3" + 4))

  val adder = new Function2[Int,Int, Int] {
  override def apply(a: Int, b:Int): Int = a + b
  }
}
