import java.util.Scanner

object Main extends App {
  val sc = new Scanner(System.in)

  var n = sc.nextLong
  val t = Array.range(1, 6).map(i => Array(i, math.pow(10, 3 * i).toLong)).reverse
  val l = math.pow(10, 3).toLong
  var ans: Long = 0
  for((e, ii) <- t.zipWithIndex) {
    val i = e(0).toInt
    val v = e(1)
    val a: Long = n / v
    if(a >= l) {
      ans += (t(ii - 1)(1) - v) * i
    } else if(a > 0) {
      ans += (n - v + 1) * i
    }
  }
  println(ans)
}
