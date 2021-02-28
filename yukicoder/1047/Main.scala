import java.util.Scanner

object Main extends App {
  val sc = new Scanner(System.in)

  val a = sc.nextLong
  val b = sc.nextLong


  def solve(a: Long, b: Long): Int = {
    var n = 0L
    for(i <- 1 to 3) {
      n = a * n + b
      if(n == 0) return i
    }
    -1
  }
  println(solve(a, b))
}
