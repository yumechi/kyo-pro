import java.util.Scanner

object Main extends App {
  def calc(arr: Array[BigInt]): BigInt = {
    val limit = BigInt(math.pow(10, 18).toLong)
    var s = BigInt(1)
    if(arr.contains(BigInt(0))) {
      return 0
    }
    for (a <- arr) {
      s *= a
      if (s > limit) {
        return -1
      }
    }
    s
  }

  val sc = new Scanner(System.in)

  val n = sc.nextInt
  val an = Array.fill(n)(BigInt(sc.nextLong))
  println(calc(an))
}
