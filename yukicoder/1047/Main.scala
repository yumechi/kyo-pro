import java.util.Scanner

object Main extends App {
  val sc = new Scanner(System.in)

  val a = sc.nextInt
  val b = sc.nextInt


  def solve(a: Int, b: Int): Int = {
    var n = 0
    for(i <- 1 to 3) {
      n = a * n + b
      if(n == 0) return i
    }
    -1
  }
  println(solve(a, b))
}
