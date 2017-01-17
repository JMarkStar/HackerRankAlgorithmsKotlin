package kotlin_features

import java.util.*

/**
 * Created by jmarkstar on 16/01/2017.
 */

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)
    val s = scan.next()
    val start = scan.nextInt()
    val end = scan.nextInt()
    println(s.substring(startIndex = start, endIndex = end))
}