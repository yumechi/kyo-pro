import java.util.Scanner

object Main extends App {
  val sc = new Scanner(System.in)

  val n = sc.nextLong

  if(n <= 3) {
    println(n)
  } else {
    val t = n - 3
    println(t * 5 + 3)
  }
}
