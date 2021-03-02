import java.util.Scanner

object Main extends App {
  val sc = new Scanner(System.in)

  val n = BigInt(sc.next)
  println((0 to 60).toList.map(a => BigInt(2).pow(a)).filter(a => a <= n).max)
}
