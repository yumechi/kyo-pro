import java.util.Scanner
import scala.math.BigInt.javaBigInteger2bigInt


object Main extends App {
  val sc = new Scanner(System.in)

  val x = sc.nextBigInteger()
  val ans = x / 11 * 2
  val t = x % 11
  val m = (t == 0, t <= 6) match {
    case (true, _) => 0
    case (false, true) => 1
    case (_, _) => 2
  }
  println(ans + m)
}
