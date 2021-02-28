import java.util.Scanner

object Main extends App {
  val sc = new Scanner(System.in)

  val n = sc.nextInt
  val m = sc.nextInt
  val k = sc.nextInt
  val op = sc.next
  val arr = Array.fill(m)(BigInt(sc.nextInt)).sum % k
  val brr = Array.fill(n)(BigInt(sc.nextInt)).sum % k
  val opf = op match {
    case "+" => (x:BigInt, y:BigInt) => (x * n) % k + (y * m) % k
    case "*" => (x:BigInt, y:BigInt) => (x * y) % k
  }
  println(opf(arr, brr) % k)
}
