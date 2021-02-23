import java.util.Scanner

object Main extends App {
  val sc = new Scanner(System.in)

  val n = sc.nextInt
  println(if (n % 2 == 0) n + 1 else n)
}
