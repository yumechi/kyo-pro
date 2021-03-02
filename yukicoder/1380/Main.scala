import java.util.Scanner

object Main extends App {
  val sc = new Scanner(System.in)

  val n = sc.nextInt
  val k = sc.nextInt
  val pn = Array.fill(n)(sc.nextInt)
  println((0 to pn.max).map(a => pn.count(_ >= a)).filter(_ <= k).appended(0).max)
}
