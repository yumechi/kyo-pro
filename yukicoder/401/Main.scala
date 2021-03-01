import java.util.Scanner

object Main extends App {
  val sc = new Scanner(System.in)

  val n = sc.nextInt
  var an = Array.fill(n, n)(0)
  var x: Int = 0
  var y: Int = 0
  val mode = Array(Array(1, 0), Array(0, 1), Array(-1, 0), Array(0, -1))
  var m: Int = 0
  for (i <- 1 to n * n) {
    an(y)(x) = i
    val tx = x + mode(m)(0)
    val ty = y + mode(m)(1)
    if(tx > n - 1 || ty > n - 1 || tx < 0 || ty < 0 || an(ty)(tx) != 0) m = (m + 1) % 4
    x += mode(m)(0)
    y += mode(m)(1)
  }
  println(an.map(a => a.map(b => "%03d".format(b)).mkString(" ")).mkString("\n"))
}
