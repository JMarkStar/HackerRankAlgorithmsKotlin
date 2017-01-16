import java.util.*

/**
 * Created by jmarkstar on 16/01/2017.
 */

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)
    val t = scan.nextInt()
    for(i in 0 until t step 1){
        val a = scan.nextInt()
        val b = scan.nextInt()
        val n = scan.nextInt()
        var result: String = ""
        (1..n).map { i -> a + (0 until i).sumBy { 2.pow(it)*b } }
              .forEach { result += "$it " }
        println(result.trim())
    }
    scan.close()
}

fun Int.pow(exp: Int): Int = Math.pow(this.toDouble(), exp.toDouble()).toInt()