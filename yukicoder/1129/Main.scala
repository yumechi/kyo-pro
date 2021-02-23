import java.util.Scanner

object Main extends App {
  val jan: (Int, Int) => Int = (x: Int, y: Int) => {
    val table = Array(
      Array(0, 2, 1),
      Array(1, 0, 2),
      Array(2, 1, 0)
    )
    table(x)(y)
  }

  val sc = new Scanner(System.in)
  val an = Array.fill(4)(sc.nextInt)
  println(Array(an(0).compareTo(an(2)), jan(an(1), an(3))) match {
    case Array(1, _) => "null"
    case Array(-1, _) => "tRue"
    case Array(0, 1) => "tRue"
    case Array(0, 2) => "null"
    case Array(0, 0) => "Draw"
  })
}
