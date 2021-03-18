import java.util.Scanner

object Main extends App {
  val sc = new Scanner(System.in)

  val m = sc.nextInt
  val h = sc.nextInt
  println(if(h % m == 0) "Yes" else "No")

}
