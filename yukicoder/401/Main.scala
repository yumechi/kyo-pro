import java.util.Scanner

object Main extends App {
  val sc = new Scanner(System.in)

  val n = sc.nextInt
  var an = Array.fill(n, n)(0)
  var x = 0
  var y = 0
  var mode = 1
  for (i <- 1 to n * n) {
    an(y)(x) = i
    if (mode == 1) {
      if (x == n - 1 || (x < n - 1 && an(y)(x + 1) != 0)) {
        mode = 2
        y += 1
      } else {
        x += 1
      }
    } else if (mode == 2) {
      if (y == n - 1 || (y < n - 1 && an(y + 1)(x) != 0)) {
        mode = 3
        x -= 1
      } else {
        y += 1
      }
    } else if (mode == 3) {
      if (x == 0 || (x > 0 && an(y)(x - 1) != 0)) {
        mode = 4
        y -= 1
      } else {
        x -= 1
      }
    } else if (mode == 4) {
      if (y == 0 || (y > 0 && an(y - 1)(x) != 0)) {
        mode = 1
        x += 1
      } else {
        y -= 1
      }
    }
  }
  println(an.map(a => a.map(b => "%03d".format(b)).mkString(" ")).mkString("\n"))
}
