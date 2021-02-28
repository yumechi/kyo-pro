import java.util.Scanner

object Main extends App {
  val sc = new Scanner(System.in)

  val n = sc.nextInt
  val m = sc.nextInt

  def solve(n: Int, m: Int): Int = {
    if (m >= n) return 1
    if (n % 2 == 0) return if (m >= n/2) 2 else -1
    -1
  }
  println(solve(n, m))
}
