import java.util.Scanner

object Main extends App {
  val sc = new Scanner(System.in)

  val h = sc.nextInt
  val w = sc.nextInt
  val arr = Array.fill(h)(Array.fill(w)(sc.nextInt))
  // groupby で分割できる
  // https://docs.scala-lang.org/ja/overviews/collections/trait-iterable.html
  val ar = arr.flatten.sorted grouped w

  println(ar.map(_.mkString(" ")).mkString("\n"))
}
