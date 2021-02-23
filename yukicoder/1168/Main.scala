import java.util.Scanner
import scala.annotation.tailrec

object Main extends App {

  val sc = new Scanner(System.in)

  val n = sc.nextInt

  @tailrec
  def solve(n: Int): Int = {
    if(n >= 10) {
      solve(n.toString.split("").map(_.toInt).sum)
    } else {
      n
    }
  }

  println(solve(n))
}
