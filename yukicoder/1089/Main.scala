import java.util.Scanner

object Main extends App {
  val sc = new Scanner(System.in)

  val n = sc.nextInt
  println((0 to n).toList.map(i => (0 to (n - i)).toList.count(j => n - i - j >= 0)).sum)
}
