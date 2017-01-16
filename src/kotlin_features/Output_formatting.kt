package kotlin_features

import java.util.*

/**
 * Created by jmarkstar on 16/01/2017.
 */

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)
    println("================================")
    for(i in 1..3){
        val s1 =  scan.next()
        val x  = scan.nextInt()
        println(String.format("%-${15}s%d", s1, x))
    }
    println("================================")
    scan.close()
}