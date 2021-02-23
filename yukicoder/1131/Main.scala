import java.util.Scanner

object Main extends App {
  val sc = new Scanner(System.in)

  val n = sc.nextInt
  val zn = Array.fill(n)(sc.nextDouble)
  val avg = zn.sum / zn.length
  println(zn.map(a => (50 - (avg - a) / 2).toInt).mkString("\n"))
}
