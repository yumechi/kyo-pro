import java.util.{Calendar, Scanner}


object Main extends App {
  val get_calender: (Int, Int, Int) => Calendar = (y:Int, m:Int, d:Int) => {
    val c: Calendar = Calendar.getInstance()
    // Reset milliseconds
    c.clear()
    c.set(y, m, d, 0, 0, 0)
    c
  }

  val sc = new Scanner(System.in)

  val y = sc.nextInt
  val m = sc.nextInt
  val d = sc.nextInt

  val now = get_calender(y, m, d)
  val before = get_calender(1989, 1, 8)
  val after = get_calender(2019, 4, 30)

  if(now.compareTo(before) >= 0 && now.compareTo(after) <= 0) {
    println("Yes")
  } else{
    println("No")
  }
}
