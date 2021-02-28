import java.util.Scanner

object Main extends App {
  val sc = new Scanner(System.in)

  val n = sc.nextInt
  val an = Array.fill(n - 1)(sc.nextInt)
  val san = an.sum

  println((0 to 100).count(i => (san + i) % n == 0))
}
