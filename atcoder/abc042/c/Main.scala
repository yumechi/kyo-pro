import java.util.Scanner

object Main extends App {
  val sc = new Scanner(System.in)

  val n = sc.nextInt()
  val k = sc.nextInt()
  val arr = Array.fill(k)(sc.nextInt).mkString("")
  println((n to 100000).filterNot(i => i.toString.exists(arr.contains(_))).min)
}
