import java.util.Scanner

object Main extends App {
  // なんかもう少しうまく書ける気がする（ Array の操作回りもう少しうまくできる気がする）
  def calc(ar: Array[Int], w: Int): Array[String] = {
    if(ar.length > w) {
      val f = ar.splitAt(w)
      Array(f._1.mkString(" ")).appendedAll(calc(f._2, w))
    } else {
      Array(ar.mkString(" "))
    }
  }

  val sc = new Scanner(System.in)

  val h = sc.nextInt
  val w = sc.nextInt
  val arr = Array.fill(h)(Array.fill(w)(sc.nextInt))
  val ar = arr.flatten.sorted

  println(calc(ar, w).map(_.mkString("")).mkString("\n"))
}
