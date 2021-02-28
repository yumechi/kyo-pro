import java.util.Scanner

object Main extends App {
  val sc = new Scanner(System.in)

  val a = BigInt(sc.nextInt)
  val b = BigInt(sc.nextInt)
  val c = BigInt(sc.nextInt)
  val d = BigInt(sc.nextInt)

  def check(a: BigInt, b: BigInt, c: BigInt, d: BigInt): Boolean = {
    if(a == c || b == d) return true
    if((a - c).abs + (b - d).abs <= 3) return true
    false
  }

  println(if (check(a, b, c, d)) 1 else 2)
}
