package kotlin_features

import java.util.*

/**
 * Created by jmarkstar on 16/01/2017.
 */
fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)
    val s = scan.next()
    val s_reverse = kotlin.text.String(s.toCharArray().reversedArray())
    println(s)
    println(s_reverse)
    scan.close()
}