import java.util.Scanner

object Main extends App {
  val sc = new Scanner(System.in)

  def solve(n: Int, an: Array[Int]): BigInt = {
    var cost: BigInt = 0
    var mlin: Int = 0
    for(i <- 0 to 15) {
      val mxlin = math.pow (2, i).toInt
      val e = an.slice(mlin, math.min(mlin + mxlin, n))
      cost += e.sum * i
      if (mxlin >= n) {
        return cost
      }
      mlin = mlin + mxlin
    }
    cost
  }

  val n = sc.nextInt
  val an = Array.fill(n)(sc.nextInt).sortBy((i: Int) => -i)
  println(solve(n, an))
}
