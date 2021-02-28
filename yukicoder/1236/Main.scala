import java.util.Scanner

object Main extends App {
  val sc = new Scanner(System.in)

  val n = sc.nextInt
  val a = if (n >= 12) (n - 12) else n
  val b = sc.nextInt

  val lr = BigDecimal(360d) / BigDecimal(12.0d * 60 * 60)
  val rr = BigDecimal(360d) / BigDecimal(60d * 60)
  val al = (a * 3600 + b * 60) * lr
  val tr = b * 60 * rr
  val br = if(tr > al) tr - 360 else tr
  val ans = (al - br).abs / (rr - lr)

  println(ans.toInt)
}
