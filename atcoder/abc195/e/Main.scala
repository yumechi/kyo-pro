import java.util.Scanner

object Main extends App {
  val sc = new Scanner(System.in)

  val n = sc.nextInt
  val s = sc.next
  val x = sc.next

  var dp = Array.fill(n + 1, 7)(false)
  dp(n)(0) = true
  for(i <- (0 until n).reverse) {
    val si = s(i) - '0'
    val xi = x(i)
    for(j <- 0 until 7) {
      val f1 = (10 * j) % 7
      val f2 = (10 * j + si) % 7
      dp(i)(j) = xi match {
        case 'A' => dp(i + 1)(f1) && dp(i + 1)(f2)
        case 'T' => dp(i + 1)(f1) || dp(i + 1)(f2)
      }
    }
  }
  println(if(dp(0)(0)) "Takahashi" else "Aoki")
}
