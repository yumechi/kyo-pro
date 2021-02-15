import java.util.Scanner

object Main extends App {
  val sc = new Scanner(System.in)

  val n = sc.nextInt()
  val arr = Array.fill(n)(sc.nextInt)

  val ans = (-100 to 100).map(a => arr.map(e => math.pow(a - e, 2)).sum.toInt).min
  println(ans)
}
