import java.math.BigInteger
import java.util.Scanner
import scala.math.BigInt.javaBigInteger2bigInt

object Main extends App {
  val sc = new Scanner(System.in)

  val n = sc.nextInt
  val m = sc.nextInt
  val op = sc.next
  val arr = Array.fill(m)(sc.nextBigInteger)
  val brr = Array.fill(n)(sc.nextBigInteger)
  val opf = op match {
    case "+" => (x:BigInteger, y:BigInteger) => (x + y)
    case "*" => (x:BigInteger, y:BigInteger) => (x * y)
  }
  brr.map(b => println(arr.map(a => opf(a, b)).mkString(" ")))
}
