import java.util.Scanner


object Main extends App {
  val sc = new Scanner(System.in)

  val a = sc.nextInt
  val b = sc.nextInt
  val c = sc.nextInt

  println(Array((b - a).abs, (b - c).abs, (a - c).abs).min)
}
