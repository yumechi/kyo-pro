import java.util.Scanner

object Main extends App {
  val sc = new Scanner(System.in)

  val n = sc.nextInt
  var ans = 0
  for(i <- 0 to n) {
    for(j <- 0 to (n - i)) {
      val k = n - (i + j)
      if(i + j + k == n) {
        ans += 1
      }
    }
  }
  println(ans)
}
