import java.util.Scanner

object Main extends App {
  val sc = new Scanner(System.in)

  def solve(n: String): String = {
    if(n.startsWith("-") || n.length < 3){
      "0"
    } else {
      n.substring(0, n.length - 2)
    }
  }

  val n = sc.next
  print(solve(n))
}
