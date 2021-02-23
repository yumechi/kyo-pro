import java.util.Scanner

object Main extends App {
  val sc = new Scanner(System.in)

  val tn = Array.fill(3)(BigInt(sc.nextLong))
  println(if (tn.product % 3 == 0) "Yes" else "No")
}
