import java.util.Scanner

object Main extends App {
  val sc = new Scanner(System.in)

  val arr = Array.fill(2)(sc.nextInt)
  val m = arr.min
  val n = arr.max
  println(if (m == n) {
    2 * m - 1
  } else {
    2 * m
  })
}
